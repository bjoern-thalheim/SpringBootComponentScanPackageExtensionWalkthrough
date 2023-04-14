package com.adesso.bt;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootComponentScanPackageExtensionWalkthroughApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(SpringBootComponentScanPackageExtensionWalkthroughApplicationTests.class);
    
	@Test
	void contextLoads() {
		log.info("{}: ping", this.getClass());
	}

}
