package com.example;

import io.micronaut.http.client.annotation.Client;

@Client
public interface WorkingClient extends WorkingOperations<TestResponse,TestCommand> {

}