package com.javamastermind.payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lahiru_w
 */
@SpringBootApplication
public class JmPaymentProcessApplication
{

    public static final Logger log = LoggerFactory.getLogger(JmPaymentProcessApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(JmPaymentProcessApplication.class, args);
        log.info("Payment processing application has started to run");
    }

}
