package com.venky.polling.model;

import java.util.HashMap;
import java.util.Map;

public class PollResult {
  public static Map<String,Double> result = new HashMap<>();
 String message ;

    public Map<String, Double> getResult() {
        return result;
    }

    public void setResult(Map<String, Double> result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
