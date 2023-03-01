package com.details.learner.identity.service;

import com.details.learner.identity.model.Learner;
import com.details.learner.identity.repository.LearnerRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnerService {
    //Autowiring learnersRepository
    @Autowired
    private LearnerRepository learnerRepository;

    //function to save details
    public String saveLearnerDetails(Learner learner) {
        Learner save= learnerRepository.save(learner);
        return "Created Details"+save;
    }

    //function to read details
    public List<Learner> findLearnerDetails(){
        return learnerRepository.findAll();
    }

    //function to read details by id
    public Optional<Learner> findLearnerDetailsById(Integer id) {
        return learnerRepository.findById(id);
    }

    //function to delete details by id
    public String deleteLearnerDetailsById(Integer id) {
        learnerRepository.deleteById(id);
        return "Deleted";
    }

    //function to count number of details
    public long countDetails() {
        return learnerRepository.count();
    }

    //function to check a particular detail exist by id
    public boolean existsDetails(Integer id) {
        return learnerRepository.existsById(id);
    }
    //function to delete entire table
    public String deleteAllDetails() {
        learnerRepository.deleteAll();
        return "Deleted All";
    }
}
