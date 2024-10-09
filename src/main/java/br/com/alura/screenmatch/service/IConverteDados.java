package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> tClass) throws JsonProcessingException; // generics quando não sabemos qual entidade vai ser devolvida
}
