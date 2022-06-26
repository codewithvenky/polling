package com.venky.polling.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class Poll {
    private int id ;
    private String pollName ;
    private String pollDes;
    private List<String> options;
    private Timestamp pollStartTime;
    private Timestamp pollEndTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPollName() {
        return pollName;
    }

    public void setPollName(String pollName) {
        this.pollName = pollName;
    }

    public String getPollDes() {
        return pollDes;
    }

    public void setPollDes(String pollDes) {
        this.pollDes = pollDes;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Timestamp getPollStartTime() {
        return pollStartTime;
    }

    public void setPollStartTime(Timestamp pollStartTime) {
        this.pollStartTime = pollStartTime;
    }

    public Timestamp getPollEndTime() {
        return pollEndTime;
    }

    public void setPollEndTime(Timestamp pollEndTime) {
        this.pollEndTime = pollEndTime;
    }


    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", pollName='" + pollName + '\'' +
                ", pollDes='" + pollDes + '\'' +
                ", options=" + options +
                ", pollStartTime=" + pollStartTime +
                ", pollEndTime=" + pollEndTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(pollName, poll.pollName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pollName);
    }

}
