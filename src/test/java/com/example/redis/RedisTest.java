package com.example.redis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith({SpringExtension.class})
@ActiveProfiles("test")
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void redisTest() {
        final String key = "testString";
        final ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();

        valueOperations.set(key, "1");
        final String result = valueOperations.get(key);

        assertThat(result).isEqualTo("1");
    }

}
