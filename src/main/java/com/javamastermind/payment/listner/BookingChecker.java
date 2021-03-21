package com.javamastermind.payment.listner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.javamastermind.payment.domain.Booking;
import com.javamastermind.payment.enums.Statuses;
import com.javamastermind.payment.events.BookingProcessor;

/**
 * @author lahiru_w
 *
 */
@Component
public class BookingChecker
{

    public static final Logger log = LoggerFactory.getLogger(BookingChecker.class);

    private static final Long MAX_AMOUNT = 10_000_000L;

    private BookingProcessor bookingProcessor;

    @Autowired
    public BookingChecker(BookingProcessor bookingProcessor)
    {
        this.bookingProcessor = bookingProcessor;
    }

    @StreamListener(BookingProcessor.APPLICATIONS_IN)
    public void checkAndSortLoans(Booking booking)
    {
        log.info("{} {} for ${} for {}", booking.getStatus(), booking.getBookingTranUUId(), booking.getBookedPrice(),
            booking.getUserId());

        try {
            if (Long.parseLong(booking.getBookedPrice()) > MAX_AMOUNT) {
                booking.setStatus(Statuses.DECLINED.name());
                bookingProcessor.declined().send(message(booking));
            } else {
                booking.setStatus(Statuses.CONFIRMED.name());
                bookingProcessor.confirmed().send(message(booking));
            }
        } catch (Exception e) {
            booking.setStatus(Statuses.DECLINED.name());
            bookingProcessor.declined().send(message(booking));
        }
       

        log.info("{} {} for ${} for {}", booking.getStatus(), booking.getBookingTranUUId(), booking.getBookedPrice(),
            booking.getUserId());

    }

    private static final <T> Message<T> message(T val)
    {
        return MessageBuilder.withPayload(val).build();
    }
}
