package com.gialnet.questions.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

    @Autowired
    private final QuestionsRepository questionsRepository;

    public QuestionsController(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Questions> getAllQuestions(){
        return questionsRepository.findAll();
    }
}
