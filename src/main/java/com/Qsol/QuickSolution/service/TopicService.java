package com.Qsol.QuickSolution.service;

import com.Qsol.QuickSolution.models.Topic;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TopicService {
    List<Topic> getAllTopics();
}
