package com.lambo.demo;

import org.reactivestreams.Subscription;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author ramboy
 */
public class FluxTest {

    public void test1() {
//        Flux.just(1, 2, 3, 4, 5).subscribe(new CoreSubscriber<>() {//这里传入CoreSubscriber对象作为订阅者
//            @Override
//            public void onSubscribe(Subscription s) {
//                System.out.println(String.format("onSubscribe, {}", s.getClass()));
//                s.request(5);
//            }
//            @Override
//            public void onNext(Integer integer) {
//                System.out.println(String.format("onNext： {}", integer));
//            }
//            @Override
//            public void onError(Throwable t) {
//            }
//            @Override
//            public void onComplete() {
//                System.out.println("onComplete");
//            }
//        });
    }

    public void test13() {
        Flux.range(1, 10).take(2).subscribe(System.out::println);
    }

    public static void main(String[] args) {

//        Flux.just("Hello", "World").subscribe(System.out::println);
//        Flux.fromArray(new Integer[] {1, 2, 3}).subscribe(System.out::println);
//        Flux.empty().subscribe(System.out::println);
//        Flux.range(1, 10).subscribe(System.out::println);
//        Flux.interval(Duration.of(10, ChronoUnit.SECONDS)).subscribe(System.out::println);

//        Flux.generate(sink -> {
//            sink.next("Hello");
//            sink.complete();
//        }).subscribe(System.out::println);

        Flux.range(1, 10).filter(i -> i % 2 == 0).subscribe(System.out::println);

//        Flux.just(5, 10).concatMap(x -> Flux.interval(Duration.of(x * 1, ChronoUnit.SECONDS), Duration.ofSeconds(10)).take(x)).toStream().forEach(System.out::println);

//        Flux<String> flux = Flux.generate(
//                () -> 0,
//                (state, sink) -> {
//                    sink.next("3 x " + state + " = " + 3*state);
//                    if (state == 10) sink.complete();
//                    return state + 1;
//                });
//
//        flux.subscribe(System.out::println);

//        Flux.generate(sink -> {
//            sink.next("Echo");
//            sink.complete();
//        }).subscribe(System.out::println);
    }
}
