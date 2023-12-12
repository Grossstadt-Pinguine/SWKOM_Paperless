package at.fhtw.swen3.paperless.ocr.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import at.fhtw.swen3.paperless.ocr.config.RabbitMQConfig;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class ConsumerService {
    Logger logger = LogManager.getLogger(ConsumerService.class);

    private final OcrDispatcherService dispatcherService;

    public ConsumerService(OcrDispatcherService dispatcherService) {
        this.dispatcherService = dispatcherService;
    }

    @RabbitListener(queues = RabbitMQConfig.PAPERLESS_REST_QUEUE)
    public void receive(String message) {
        this.logger.info(String.format("Received a message over %s:\n%s",
            RabbitMQConfig.PAPERLESS_REST_QUEUE, message));

        // TODO does this need to be threaded?
        dispatcherService.handleMessage(message);
    }
}
