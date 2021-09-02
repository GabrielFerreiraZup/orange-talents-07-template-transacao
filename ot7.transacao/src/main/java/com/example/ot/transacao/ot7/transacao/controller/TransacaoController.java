package com.example.ot.transacao.ot7.transacao.controller;


import com.example.ot.transacao.ot7.transacao.model.Transacao;
import com.example.ot.transacao.ot7.transacao.model.dto.TransacaoDto;
import com.example.ot.transacao.ot7.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    TransacaoRepository transacaoRepository;

    @GetMapping("/{id}")
    public List<TransacaoDto> pegarUltimasTransacoes(@PathVariable String id){

        //refatorar para limitar o tamanho maximo da transacao
        List<TransacaoDto> listaTransacoes = new ArrayList<>();
        List<Transacao> listaRepo = transacaoRepository.getLastTransactions(id);
        for (int i = 0; i < 10; i++) {
            TransacaoDto newTransacaoDto = new TransacaoDto(listaRepo.get(i));
            listaTransacoes.add(newTransacaoDto);


        }


        return  listaTransacoes;



    }
}
