package com.Qsol.QuickSolution.controllers;

import com.Qsol.QuickSolution.models.Topic;
import com.Qsol.QuickSolution.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class TopicController {
    @Autowired
    private TopicService topicService;




    @GetMapping("/topics/list")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }


}
