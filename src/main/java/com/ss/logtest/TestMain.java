package com.ss.logtest;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.ss.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TestMain {
  //  private static final Logger LOGGER = Logger.getLogger(TestMain.class.getName());


   // private static final Logger logger = LoggerFactory.getLogger(TestMain.class);

    private static final Logger logger = LogManager.getLogger(TestMain.class);

    public static void main(String[] args) {
        logger.trace("Hello world  log level TRACE");
        logger.debug("Hello World Log Level DEBUG");
        logger.info("Hello world log level INFO");
        logger.warn("Hello world log level WARN");
        logger.error("Hello world log level ERROR", new NullPointerException("NullError"));
        System.out.println("Final Message : Hello World");

        User user = new User();
        user.testLog();
    }
}
