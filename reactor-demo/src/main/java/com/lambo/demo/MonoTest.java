package com.lambo.demo;

import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author ramboy
 */
public class MonoTest {

    public static void main(String[] args) {
        Mono.fromSupplier(() -> "Mono1").subscribe(System.out::println);
        Mono.justOrEmpty(Optional.of("Mono2")).subscribe(System.out::println);
        Mono.create(sink -> sink.success("Mono3")).subscribe(System.out::println);
    }
}
