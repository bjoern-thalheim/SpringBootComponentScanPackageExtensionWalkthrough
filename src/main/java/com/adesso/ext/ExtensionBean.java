package com.adesso.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExtensionBean {
    private static final Logger log = LoggerFactory.getLogger(ExtensionBean.class);
	
	@Scheduled(fixedDelay = 300)
	public void ping() {
		log.info("{}: ping", this.getClass());
	}

}
