package com.venky.polling.repository;

import com.venky.polling.model.Poll;
import com.venky.polling.model.User;

import java.util.*;

public class MiniDataBase {
    static {
        allUsers= Arrays.asList( new User(1,"venky","123"),
                new User(2,"ram","123"),
                new User(3,"vivek","123"),
                new User(4,"abhi","123"),
                new User(5,"toto","123"),
                new User(6,"rohit","123"),
                new User(7,"kartik","123"));




    }
    public static Set<Poll> pollDb = new HashSet<>();
    public static  List<User> allUsers;
}
