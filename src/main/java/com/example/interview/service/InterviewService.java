package com.example.interview.service;

import com.example.interview.component.ResponseStrategy;
import com.example.interview.domain.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InterviewService {

    public static final String WHAT_IS_AMEX = "Qu'est ce que c'est Amex ?";

    private final ResponseStrategy responseStrategy;

    public InterviewService(@Qualifier("responseIDKStrategy") ResponseStrategy responseStrategy) {
        this.responseStrategy = responseStrategy;
    }

    public Optional<Response> reply(String question){
        if (WHAT_IS_AMEX.equals(question)){
            return Optional.of(responseStrategy.giveAnswer());
        }
        else {
            return Optional.empty();
        }
    }

}
