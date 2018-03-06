package com.gialnet.questions.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionsRepository extends CrudRepository<Questions, Long> {

    List<Questions> findAll();

}
