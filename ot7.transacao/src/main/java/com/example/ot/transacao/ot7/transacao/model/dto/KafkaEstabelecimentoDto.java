package com.example.ot.transacao.ot7.transacao.model.dto;

public class KafkaEstabelecimentoDto {

    private String nome;

    private String cidade;

    private String endereco;

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public KafkaEstabelecimentoDto() {
    }

    public KafkaEstabelecimentoDto(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "KafkaEstabelecimentoDto{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
