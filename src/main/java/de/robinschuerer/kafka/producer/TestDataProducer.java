package de.robinschuerer.kafka.producer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestDataProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestDataProducer.class);

	@Autowired
	private KafkaTemplate<Integer, String> template;

	@PostConstruct
	public void setup()  {
		produce();
	}

	private void produce()  {

		LOGGER.info("sending test data!");

		this.template.send("myTopic", "foo1");
		this.template.send("myTopic", "foo2");
		this.template.send("myTopic", "foo3");
		LOGGER.info("All received");

	}

	public void sout() {
		System.out.println("yea");
	}

	@PreDestroy
	public void predestroy() {
		System.out.println("shutdown");
	}
}
