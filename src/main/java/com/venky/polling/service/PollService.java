package com.venky.polling.service;

import com.venky.polling.model.Poll;
import com.venky.polling.model.PollResult;
import com.venky.polling.model.User;
import com.venky.polling.model.Vote;
import com.venky.polling.repository.MiniDataBase;
import com.venky.polling.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PollService {

    @Autowired
    PollRepository pollRepository;
    public Set<Poll> createPoll(Poll poll) {

        return pollRepository.createPoll(poll);


    }
    public List<User> getAllUsers() {
        return pollRepository.getAllUsers();
    }
    public PollResult vote(Vote vt) {
        PollResult  resutl = new PollResult();
        return  null;

    }
}
