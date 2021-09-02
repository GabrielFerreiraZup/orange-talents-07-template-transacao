package com.example.ot.transacao.ot7.transacao.uteis;

import com.example.ot.transacao.ot7.transacao.model.dto.KafkaTransacaoDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.kafka.common.serialization.Deserializer;


import java.io.IOException;
import java.io.InputStream;

public class GsonDeserializer implements Deserializer<KafkaTransacaoDto> {

    private Gson gson = new GsonBuilder().create();


    @Override
    public KafkaTransacaoDto deserialize(String s, byte[] bytes) {
        return gson.fromJson(new String(bytes),KafkaTransacaoDto.class);

    }
}
