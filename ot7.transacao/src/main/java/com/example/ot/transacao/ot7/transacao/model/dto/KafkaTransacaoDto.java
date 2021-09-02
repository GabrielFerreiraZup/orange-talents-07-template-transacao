package com.example.ot.transacao.ot7.transacao.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class KafkaTransacaoDto {

    private String id;

    private Double valor;

    private KafkaEstabelecimentoDto estabelecimento;

    private KafkaCartaoDto cartao;

    private LocalDateTime efetivadaEm;

    public String getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public KafkaEstabelecimentoDto getEstabelecimento() {
        return estabelecimento;
    }

    public KafkaCartaoDto getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public KafkaTransacaoDto() {
    }

    public KafkaTransacaoDto(String id, Double valor, KafkaEstabelecimentoDto estabelecimento, KafkaCartaoDto cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    @Override
    public String toString() {
        return "KafkaTransacaoDto{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
