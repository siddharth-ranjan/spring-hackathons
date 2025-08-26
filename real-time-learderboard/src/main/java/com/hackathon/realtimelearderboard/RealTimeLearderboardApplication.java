package com.hackathon.realtimelearderboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealTimeLearderboardApplication {

    private static final Logger logger = LoggerFactory.getLogger(RealTimeLearderboardApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Real-Time Leaderboard Application");
        SpringApplication.run(RealTimeLearderboardApplication.class, args);
        logger.info("Real-Time Leaderboard Application started successfully");
    }

}
