package com.example.ot.transacao.ot7.transacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idExterno;

    private String email;

    public Long getId() {
        return id;
    }

    public String getIdExterno() {
        return idExterno;
    }

    public String getEmail() {
        return email;
    }
    @Deprecated
    public Cartao() {
    }

    public Cartao(String idExterno, String email) {
        this.idExterno = idExterno;
        this.email = email;
    }
}
