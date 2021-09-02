package com.example.ot.transacao.ot7.transacao.repository;

import com.example.ot.transacao.ot7.transacao.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao,Long> {
}
