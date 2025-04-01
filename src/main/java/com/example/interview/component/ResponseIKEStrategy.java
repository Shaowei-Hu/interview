package com.example.interview.component;

import com.example.interview.domain.Response;
import org.springframework.stereotype.Component;

@Component
public class ResponseIKEStrategy implements ResponseStrategy{

    public static final String I_KNOW_ALL = "Je sais tout";

    public Response giveAnswer(){
        Response response = new Response();
        response.setContent(I_KNOW_ALL);
        response.setIndicesConfidence(5);
        return response;
    }
}
