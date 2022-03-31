package com.ss.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
    private static final Logger logger = LogManager.getLogger(User.class);
    private String name;
    private String address;

    public void testLog(){
        logger.trace("Hello world  log level TRACE");
        logger.debug("Hello World Log Level DEBUG");
        logger.info("Hello world log level INFO");
        logger.warn("Hello world log level WARN");
        System.out.println("name " + name + " address " + address);
    }

}
