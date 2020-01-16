package com.lambo.demo.rocketmq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class BroadcastProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("example_group_name");

        producer.setNamesrvAddr("localhost:9876");

        producer.start();

        for (int i=0; i<10; i++) {
            Message msg = new Message("topicExample", "tagA", "orderId188",
                    "Hello Wordl".getBytes(RemotingHelper.DEFAULT_CHARSET));

            SendResult result = producer.send(msg);
            System.out.printf("%s%n", result);
        }

        producer.shutdown();
    }
}
