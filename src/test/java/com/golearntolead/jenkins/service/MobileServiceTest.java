package com.golearntolead.jenkins.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
@Slf4j
public class MobileServiceTest {

    @Test
    void test(){
        log.info("The Test case also started : ----> ");
        assertEquals(true, true);
    }
}
