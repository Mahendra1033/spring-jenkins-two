package com.golearntolead.jenkins;

import com.golearntolead.jenkins.entity.Mobile;
import com.golearntolead.jenkins.repository.MobileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class SpringJenkinsTwoApplication {

    @PostConstruct
    public void init(){
        log.info("Application started : ------> ");
    }
    public static void main(String[] args) {
        log.info("Application executed : --------> ");
        SpringApplication.run(SpringJenkinsTwoApplication.class, args);
    }

}
