package com.example;

import io.micronaut.core.annotation.Introspected;

import java.util.UUID;

@Introspected
public class TestResponse {
    public UUID id;
    public String name;
}
