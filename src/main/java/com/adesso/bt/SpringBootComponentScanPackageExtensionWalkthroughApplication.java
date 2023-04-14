package com.adesso.bt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class SpringBootComponentScanPackageExtensionWalkthroughApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringBootComponentScanPackageExtensionWalkthroughApplication.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringBootComponentScanPackageExtensionWalkthroughApplication.class, args);
		log.info("{}: ping", SpringBootComponentScanPackageExtensionWalkthroughApplication.class);
		Thread.sleep(1000);
	}

}
