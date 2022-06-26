package com.venky.polling.model;

public class Vote {
    private  String username;
    private String password;
    private String  pollName;
    private String  optionVote;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPollName() {
        return pollName;
    }

    public void setPollName(String pollName) {
        this.pollName = pollName;
    }

    public String getOptionVote() {
        return optionVote;
    }

    public void setOptionVote(String optionVote) {
        this.optionVote = optionVote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pollName='" + pollName + '\'' +
                ", optionVote='" + optionVote + '\'' +
                '}';
    }
}
