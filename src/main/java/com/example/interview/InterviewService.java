package com.example.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {
    @Autowired
    ResponseIDKStrategy responseStrategy;

    Response reply(String question){
        if (question.equals("Qu'est ce que c'est Amex ?")){
            return responseStrategy.giveAnswer();
        }
        else{
            return null;
        }
    }

    void verifierBankAccount(){
        System.out.println("great");
    }
}
