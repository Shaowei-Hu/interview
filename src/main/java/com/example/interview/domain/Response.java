package com.example.interview.domain;

import java.util.Objects;

public class Response {

    private String content;
    private int indicesConfidence;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getIndicesConfidence() {
        return indicesConfidence;
    }

    public void setIndicesConfidence(int indicesConfidence) {
        this.indicesConfidence = indicesConfidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return indicesConfidence == response.indicesConfidence && Objects.equals(content, response.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, indicesConfidence);
    }
}
