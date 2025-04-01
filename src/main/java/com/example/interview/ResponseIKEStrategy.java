package com.example.interview;

import org.springframework.stereotype.Component;

@Component
class ResponseIKEStrategy{
    Response giveAnswer(){
        Response response = new Response();
        response.content = "Je sais tout";
        response.indiceConfiance = 5;
        return response;
    }
}
