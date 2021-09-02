package com.example.ot.transacao.ot7.transacao.model.dto;

public class KafkaCartaoDto {

    private String id;

    private String email;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public KafkaCartaoDto() {
    }

    public KafkaCartaoDto(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "KafkaCartaoDto{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
