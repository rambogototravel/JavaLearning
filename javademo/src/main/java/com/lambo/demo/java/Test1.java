package com.lambo.demo.java;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.io.File;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.*;

public class Test1 {

    private static Map<String, Object> map = new HashMap<>();

    private static long initDelay = 10;

    private static volatile long delay = 10;

    private static boolean isSwap = false;

    private static Object waitObject = new Object();

    static ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "");
        }
    });

    public static void main(String[] args) throws InterruptedException, IOException {

//        test1();

//        test2();

//        test3();

//        test4();

//        test5();

//        test6();

//        test7();

//        test8();

//        test9();

        File file = new File("0000000000017000000");
        System.out.println(file.getName());
        System.out.println(Long.parseLong(file.getName()));

        System.in.read();
    }

    private static void test10() {
        ExecutorService executorService = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(),
        new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r, "");
                System.out.println(thread.toString());
                return thread;
            }
        });

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World ");
                System.out.println(this.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                executorService.execute(this);
            }
        };

        executorService.execute(r);
    }

    private static void test9() {
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + " Hello World");

                getDelay();

                System.out.println(Thread.currentThread().getName() + " " + delay);
            }
        }, 2, delay, TimeUnit.SECONDS);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " " + delay);

                while (true) {
                    if (delay > initDelay) {
                        try {
                            waitObject.wait(delay);

                            System.out.println(Thread.currentThread().getName() + "， 重新创建任务。");

                            if (delay > initDelay) {

                                scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
                                    @Override
                                    public void run() {
                                        System.out.println(Thread.currentThread().getName() + " Hello World");

                                        getDelay();

                                        System.out.println(Thread.currentThread().getName() + " " + delay);
                                    }
                                }, 2, delay, TimeUnit.SECONDS);
                            }

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    private static long getDelay() {

        LocalTime beginTime = LocalTime.of(15, 30);

        LocalTime endTime = LocalTime.of(16, 20);

        LocalTime currentTime = LocalTime.now();
//        LocalTime currentTime = LocalTime.of(15, 37);

        if (currentTime.isAfter(beginTime) && currentTime.isBefore(endTime)) {

            if (-1 == delay) {
                delay = initDelay;
            } else {
                if (delay > initDelay && isSwap) {
                    delay = initDelay;
                    isSwap = false;

                    scheduledExecutorService.shutdown();
                    waitObject.notify();
                }
            }
        } else {

            if (currentTime.isBefore(beginTime)) {

                delay = Duration.between(currentTime, beginTime).getSeconds();
            } else {

                delay = (24 * 3600) + (Duration.between(currentTime, beginTime).getSeconds());
            }

            scheduledExecutorService.shutdown();
            isSwap = true;

            waitObject.notify();
        }
        return delay;
    }

    private static void test8() {
        long delay = 0;

        LocalDateTime beginTime = LocalDateTime.now().withHour(8).withMinute(0).withSecond(0).withNano(0);
        System.out.println(beginTime);

        LocalDateTime endTime = LocalDateTime.now().withHour(22).withMinute(0).withSecond(0).withNano(0);
        System.out.println(endTime);

        LocalDateTime currentTime = LocalDateTime.now();

        if (currentTime.isAfter(beginTime) && currentTime.isBefore(endTime)) {

        } else {

            //当前时间还未到 开始执行时间
            //当前时间已是 开始执行时间的下一天


        }
    }

    private static void test7() {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println(datetime1);

        LocalDate date = LocalDate.of(2017, 11, 23);

        System.out.println("年份:"+date.getYear());

        Month month = date.getMonth();
        System.out.println("月份(单词):"+month);
        int monthValue = date.getMonthValue();
        System.out.println("月份(数字)"+monthValue);

        System.out.println("多少号:"+date.getDayOfMonth());


        System.out.println("返回由此日期表示的月份的长度:"+date.lengthOfMonth());
        System.out.println("返回由此日期表示的年份的长度:"+date.lengthOfYear());

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("星期几(单词):"+dayOfWeek);
        System.out.println("星期几(数字):"+dayOfWeek.getValue());


        System.out.println("一年中的第几天:"+date.getDayOfYear());


        System.out.println("是否是闰年:"+ date.isLeapYear());

        LocalDate a = LocalDate.of(2012, 6, 30);
        System.out.println("检查此日期是否在指定日期之后:"+ date.isAfter(a));
        System.out.println("检查此日期是否在指定日期之前:"+date.isBefore(a));
        System.out.println("检查此日期是否等于指定的日期。"+date.isEqual(a));

        System.out.println("将日期输出:"+date.toString());
    }

    private static void test6() throws InterruptedException {
        CountDownLatch c = new CountDownLatch(2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                System.out.println(2);
                c.countDown();
            }
        }).start();

        c.await();

        System.out.println(3);
    }

    private static void test5() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("all thread finish");
    }


    private static void test4() {
        int COUNT_BITS = Integer.SIZE - 3;

        System.out.println(-1 << COUNT_BITS);

        System.out.println(1 << COUNT_BITS);

        System.out.println((-1 << COUNT_BITS) | 0);
    }

    private static void test3() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        t.start();

        System.out.println(t.isDaemon());
    }

    private static void test2() {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static void test1() {
        map.put("A", new String("a"));
        map.put("B", new Integer(1));

        System.out.println(get("A", String.class));
        System.out.println(get("B", Integer.class));
        System.out.println(get("C", Long.class));
    }

    public static <T> T get(String key, Class<T> tClass) {
        return (T) map.get(key);
    }
}
