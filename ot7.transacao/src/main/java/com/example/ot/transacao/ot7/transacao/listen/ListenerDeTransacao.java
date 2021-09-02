package com.example.ot.transacao.ot7.transacao.listen;


import com.example.ot.transacao.ot7.transacao.model.Cartao;
import com.example.ot.transacao.ot7.transacao.model.Estabelecimento;
import com.example.ot.transacao.ot7.transacao.model.Transacao;
import com.example.ot.transacao.ot7.transacao.model.dto.KafkaTransacaoDto;
import com.example.ot.transacao.ot7.transacao.repository.CartaoRepository;
import com.example.ot.transacao.ot7.transacao.repository.EstabelecimentoRepository;
import com.example.ot.transacao.ot7.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ListenerDeTransacao {
    @Autowired
    TransacaoRepository transacaoRepository;
    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    CartaoRepository cartaoRepository;


    @KafkaListener(topics = "transacoes")
    public void ouvir(KafkaTransacaoDto eventoDeTransacao) {
        //System.out.println(eventoDeTransacao.toString());
        System.out.println(eventoDeTransacao.getValor());
        Estabelecimento novoEstabelecimento = new Estabelecimento(eventoDeTransacao.getEstabelecimento().getNome(),eventoDeTransacao.getEstabelecimento().getCidade(),eventoDeTransacao.getEstabelecimento().getEndereco());
        Cartao novoCartao = new Cartao(eventoDeTransacao.getCartao().getId(),eventoDeTransacao.getCartao().getEmail());
        estabelecimentoRepository.save(novoEstabelecimento);
        cartaoRepository.save(novoCartao);
        Transacao novaTransacao = new Transacao(eventoDeTransacao.getId(),eventoDeTransacao.getValor(),novoEstabelecimento,novoCartao,eventoDeTransacao.getEfetivadaEm());
        transacaoRepository.save(novaTransacao);

    }
}
