package com.dotjson.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageRequest {

    @JsonProperty("message")
    private String message;

    public String getMessage() {
        return message;
    }


}
