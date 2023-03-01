package com.details.learner.identity.controller;

import com.details.learner.identity.model.Learner;
import com.details.learner.identity.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/learner")
public class LearnerController {
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


}
