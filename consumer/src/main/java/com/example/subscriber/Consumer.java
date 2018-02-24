package com.example.subscriber;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;


@Component
public class Consumer {

    @StreamListener(com.example.channel.Consumer.INPUTCHANNEL)
    public void message(String message){
        System.out.print(message);
    }
}
