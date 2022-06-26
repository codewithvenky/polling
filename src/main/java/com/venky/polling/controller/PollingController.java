package com.venky.polling.controller;

import com.venky.polling.model.Poll;
import com.venky.polling.model.PollResult;
import com.venky.polling.model.User;
import com.venky.polling.model.Vote;
import com.venky.polling.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class PollingController {
    @Autowired
    private PollService pollService;

    @GetMapping("/users")
    public List<User> getAllActiveUsers()
    {

        return  pollService.getAllUsers();
    }

    @PostMapping("/createPoll")
   public Set< Poll> createPoll(@RequestBody Poll poll)
    {
    return  pollService.createPoll(poll);

    }

    @PostMapping("/vote")
 public PollResult pleaseVote(@RequestBody Vote vote)
 {
     System.out.println(vote);
     PollResult resutl = pollService.vote(vote);
     return resutl;

 }


}
