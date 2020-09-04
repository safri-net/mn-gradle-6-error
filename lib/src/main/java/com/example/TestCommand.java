package com.example;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;

@Introspected
public class TestCommand {
    @NotBlank
    public java.lang.String test;
}
