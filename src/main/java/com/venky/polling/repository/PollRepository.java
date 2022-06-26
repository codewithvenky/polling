package com.venky.polling.repository;

import com.venky.polling.model.Poll;
import com.venky.polling.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class PollRepository {
    public Set<Poll> createPoll(Poll poll) {

 int id =MiniDataBase.pollDb.size()+1;
        poll.setId(id);
        MiniDataBase.pollDb.add(poll);
        return  MiniDataBase.pollDb;

    }

    public List<User> getAllUsers() {
         return  MiniDataBase.allUsers;
    }
}
