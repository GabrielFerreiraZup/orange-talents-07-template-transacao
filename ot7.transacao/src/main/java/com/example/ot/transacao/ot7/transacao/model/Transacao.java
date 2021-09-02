package com.example.ot.transacao.ot7.transacao.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idExterno;

    private Double valor;

    @ManyToOne
    private Estabelecimento estabelecimento;

    @ManyToOne Cartao cartao;

    private LocalDateTime efetivadaEm;

    public Long getId() {
        return id;
    }

    public String getIdExterno() {
        return idExterno;
    }

    public Double getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
    @Deprecated
    public Transacao() {
    }

    public Transacao(String idExterno, Double valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.idExterno = idExterno;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }
}
