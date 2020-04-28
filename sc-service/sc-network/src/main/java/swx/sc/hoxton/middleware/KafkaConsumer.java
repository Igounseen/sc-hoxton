package swx.sc.hoxton.middleware;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"Topic-ChangJiangDelta"})
    public void consumer(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("record:{}, message:{}", record, message);
        }
    }

}
