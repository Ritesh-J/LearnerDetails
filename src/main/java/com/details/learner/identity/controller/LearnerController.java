package com.details.learner.identity.controller;

import com.details.learner.identity.model.Learner;
import com.details.learner.identity.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/learner")
public class LearnerController {
    //Autowiring LearnerService
    @Autowired
    private LearnerService learnerService;

    @RequestMapping("/details/save")
    public String saveLearnerDetails(@RequestBody Learner payload) {
        return learnerService.saveLearnerDetails(payload);
    }

    @RequestMapping("/details")
    public List<Learner> findLearnerDetails() {
        return learnerService.findLearnerDetails();
    }

    @RequestMapping("/details/{id}")
    public Optional<Learner> findDetailsById(@PathVariable("id") int id) {
        return learnerService.findLearnerDetailsById(id);
    }

    @RequestMapping("/details/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        return learnerService.deleteLearnerDetailsById(id);
    }

    @RequestMapping("/details/count")
    public long countDetails() {
        return learnerService.countDetails();
    }

    @RequestMapping("/details/exists/{id}")
    public boolean existsDetailsById(@PathVariable("id") int id) {
        return learnerService.existsDetails(id);
    }

    @RequestMapping("/details/deleteAll")
    public String deleteAllDetails() {
        return learnerService.deleteAllDetails();
    }


}
