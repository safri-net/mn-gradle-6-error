package com.example

import io.micronaut.http.client.annotation.Client

@Client
interface FailingClient extends FailingOperations<TestResponse,TestCommand> {

}