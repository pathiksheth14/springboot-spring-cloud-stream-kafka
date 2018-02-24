package com.example.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Consumer {

    String INPUTCHANNEL="event";

    @Input("event")
    SubscribableChannel message();
}
