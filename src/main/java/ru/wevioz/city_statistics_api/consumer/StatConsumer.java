package ru.wevioz.city_statistics_api.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.wevioz.city_statistics_api.dto.StatDto;
import ru.wevioz.city_statistics_api.service.StatService;

@Component
@RequiredArgsConstructor
public class StatConsumer {
    private final StatService statService;

    @RabbitListener(queues = {"user"})
    public void receive(@Payload StatDto fileBody) {
        statService.create(fileBody);
    }
}