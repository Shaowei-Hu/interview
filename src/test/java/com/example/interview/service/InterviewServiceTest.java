package com.example.interview.service;

import com.example.interview.component.ResponseIDKStrategy;
import com.example.interview.domain.Response;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InterviewServiceTest {

    @Test
    void shouldReplyForIDKStrategy() {
        // Given
        InterviewService interviewService = new InterviewService(new ResponseIDKStrategy());
        String expectedResponse = "Je ne sais pas";
        int expectedConfidence = 1;

        // When
        Optional<Response> response = interviewService.reply(InterviewService.WHAT_IS_AMEX);
        String actualResponse = response
                .map(Response::getContent)
                .orElse("");
        Integer actualIndices = response.map(Response::getIndicesConfidence)
                .orElse(-1);

        // Then
        assertEquals(expectedResponse, actualResponse);
        assertEquals(expectedConfidence, actualIndices);
    }

}
