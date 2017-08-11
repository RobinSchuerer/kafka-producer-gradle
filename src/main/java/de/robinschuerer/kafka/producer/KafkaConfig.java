package de.robinschuerer.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConfig.class);

}
