package com.example

import io.micronaut.http.annotation.Get

import javax.annotation.Nullable
import javax.validation.Valid
import java.net.http.HttpResponse

interface WorkingOperations <R,T> {

    @Get("/{?command*}")
    HttpResponse<R> get(@Nullable @Valid T command)

}