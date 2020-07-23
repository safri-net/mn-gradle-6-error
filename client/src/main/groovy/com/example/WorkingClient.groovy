package com.example

import io.micronaut.http.client.annotation.Client

@Client
interface WorkingClient extends WorkingOperations<TestResponse,TestCommand> {

}