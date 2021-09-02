package com.example.ot.transacao.ot7.transacao.model.dto;

import com.example.ot.transacao.ot7.transacao.model.Transacao;
import org.apache.kafka.common.protocol.types.Field;

public class TransacaoDto {

    private String id;

    private String valor;

    private String nome;

    private String cidade;

    private String endereco;

    private String idCartao;

    private String emailCartao;

    private String efetivadaEm;

    public String getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getIdCartao() {
        return idCartao;
    }

    public String getEmailCartao() {
        return emailCartao;
    }

    public String getEfetivadaEm() {
        return efetivadaEm;
    }

    public TransacaoDto(String id, String valor, String nome, String cidade, String endereco, String idCartao, String emailCartao, String efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
        this.idCartao = idCartao;
        this.emailCartao = emailCartao;
        this.efetivadaEm = efetivadaEm;
    }

    public TransacaoDto(Transacao transacao){
        this.id = String.valueOf(transacao.getId());
        this.valor = String.valueOf(transacao.getValor());
        this.cidade = transacao.getEstabelecimento().getNome();
        this.cidade = transacao.getEstabelecimento().getCidade();
        this.endereco = transacao.getEstabelecimento().getEndereco();
        this.idCartao = transacao.getCartao().getIdExterno();
        this.emailCartao = transacao.getCartao().getEmail();
        this.efetivadaEm = String.valueOf(transacao.getEfetivadaEm());
    }


}
