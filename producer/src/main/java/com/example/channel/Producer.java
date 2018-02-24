package com.example.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Producer {

    String OUTPUTCHANNEL="event";

    @Output("event")
    MessageChannel send();
}
