package com.adesso.bt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FrameworkBean {
    private static final Logger log = LoggerFactory.getLogger(FrameworkBean.class);
	
	@Scheduled(fixedDelay = 200)
	public void ping() {
		log.info("{}: ping", this.getClass());
	}

}
