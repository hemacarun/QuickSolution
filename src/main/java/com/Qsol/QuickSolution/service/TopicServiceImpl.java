package com.Qsol.QuickSolution.service;

import com.Qsol.QuickSolution.models.Topic;
import com.Qsol.QuickSolution.repos.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicServiceImpl implements TopicService{
    @Autowired
    private TopicRepo topicRepo;
    @Override
    public List<Topic> getAllTopics() {
        return topicRepo.findAll();
    }
}
