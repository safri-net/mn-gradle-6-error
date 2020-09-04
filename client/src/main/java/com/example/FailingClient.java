package com.example;

import io.micronaut.http.client.annotation.Client;

@Client
public interface FailingClient extends FailingOperations<TestResponse,TestCommand> {

}