package com.example

import io.micronaut.core.annotation.Introspected

import javax.validation.constraints.NotBlank

@Introspected
class TestCommand {
    @NotBlank
    String test
}
