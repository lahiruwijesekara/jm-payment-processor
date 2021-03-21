package com.javamastermind.payment.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface BookingProcessor {

  String APPLICATIONS_IN = "bookingoutput";
  String CONFIRMED_OUT = "bookingconfirmed";
  String DECLINED_OUT = "bookingdeclined";

  @Input(APPLICATIONS_IN)
  SubscribableChannel sourceOfBookingOrders();

  @Output(CONFIRMED_OUT)
  MessageChannel confirmed();

  @Output(DECLINED_OUT)
  MessageChannel declined();

}
