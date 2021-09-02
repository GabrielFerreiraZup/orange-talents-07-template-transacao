package com.example.ot.transacao.ot7.transacao;

import com.example.ot.transacao.ot7.transacao.model.dto.KafkaCartaoDto;
import com.example.ot.transacao.ot7.transacao.model.dto.KafkaTransacaoDto;
import com.example.ot.transacao.ot7.transacao.uteis.GsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {SpringApplication.run(Application.class, args); }

}
