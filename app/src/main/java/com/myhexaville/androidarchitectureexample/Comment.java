package com.myhexaville.androidarchitectureexample;

public class Comment {
    private String text;
    private String fromId;
    private Object timestamp;

    public Comment() {
    }

    public Comment(String text, String fromId, Object timestamp) {
        this.text = text;
        this.fromId = fromId;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public Object getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }
}
