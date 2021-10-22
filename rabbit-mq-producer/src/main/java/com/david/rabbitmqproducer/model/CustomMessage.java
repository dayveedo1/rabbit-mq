package com.david.rabbitmqproducer.model;

import lombok.Data;

import java.util.Date;

@Data
public class CustomMessage {

    private String messageId;
    private String message;
    private Date messageDate;

    public CustomMessage(){

    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
                "messageId='" + messageId + '\'' +
                ", message='" + message + '\'' +
                ", messageDate=" + messageDate +
                '}';
    }
}
