# Micronaut multi module project compile error with client 

When using gradle > 6.0, in a multi module project, a client extending an interface from another module fails in
compile phase. With the following error:

```
startup failed:
/src/scratchpad/mn-gradle-6-error/client/src/main/groovy/com/example/FailingClient.groovy: -1: The route declares a uri variable named [command], but no corresponding method argument is present
 @ line -1, column -1.
1 error
```

Another client extending an interface in the same module compiles without errors.

## Steps to reproduce:

run `./gradlew classes`
