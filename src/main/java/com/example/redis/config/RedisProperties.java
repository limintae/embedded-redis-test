package com.example.redis.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration @Getter
public class RedisProperties {
    private String redisHost;
    private int redisPort;

    public RedisProperties(
        @Value("${spring.redis.host}") String redisHost,
        @Value("${spring.redis.port}") int redisPort
    ) {
        this.redisHost = redisHost;
        this.redisPort = redisPort;
    }
}
