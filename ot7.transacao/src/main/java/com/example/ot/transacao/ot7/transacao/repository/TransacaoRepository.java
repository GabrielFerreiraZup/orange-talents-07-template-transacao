package com.example.ot.transacao.ot7.transacao.repository;

import com.example.ot.transacao.ot7.transacao.model.Transacao;
import com.example.ot.transacao.ot7.transacao.model.dto.TransacaoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao,Long> {


    @Query(value = "Select t from Transacao t where t.cartao.idExterno = :id order by t.efetivadaEm desc")
    public List<Transacao> getLastTransactions(String id);


}
