package com.details.learner.identity.repository;

import com.details.learner.identity.model.Learner;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearnerRepository extends CrudRepository<Learner, Integer> {
    public Learner save(Learner learner);
    public List<Learner> findAll();








}
