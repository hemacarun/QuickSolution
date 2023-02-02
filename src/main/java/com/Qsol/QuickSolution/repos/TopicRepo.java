package com.Qsol.QuickSolution.repos;

import com.Qsol.QuickSolution.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends JpaRepository<Topic, Long> {

}
