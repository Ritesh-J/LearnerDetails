package com.details.learner.identity.service;

import com.details.learner.identity.model.Learner;
import com.details.learner.identity.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnerService {
    @Autowired
    private LearnerRepository learnerRepository;

    public String saveLearnerDetails(Learner learner) {
        Learner save= learnerRepository.save(learner);
        return "Created Details"+save;
    }

    public List<Learner> findLearnerDetails(){
        return learnerRepository.findAll();
    }

    public Optional<Learner> findLearnerDetailsById(Integer id) {
        return learnerRepository.findById(id);
    }

    public String deleteLearnerDetailsById(Integer id) {
        learnerRepository.deleteById(id);
        return "Deleted";
    }
}
