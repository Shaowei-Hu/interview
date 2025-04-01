package com.example.interview;

import org.springframework.stereotype.Service;

@Service
class ResponseIDKStrategy{
    Response giveAnswer() {
        Response response = new Response();
        response.content = "Je ne sais pas";
        response.indiceConfiance = 1;
        return response;
    }
}
