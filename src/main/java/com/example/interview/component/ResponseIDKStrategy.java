package com.example.interview.component;

import com.example.interview.domain.Response;
import org.springframework.stereotype.Component;

@Component
public class ResponseIDKStrategy implements ResponseStrategy {

    public static final String I_DO_NOT_KNOW = "Je ne sais pas";

    public Response giveAnswer() {
        Response response = new Response();
        response.setContent(I_DO_NOT_KNOW);
        response.setIndicesConfidence(1);
        return response;
    }
}
