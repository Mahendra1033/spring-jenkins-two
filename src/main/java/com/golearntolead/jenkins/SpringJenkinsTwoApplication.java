package com.golearntolead.jenkins;

import com.golearntolead.jenkins.entity.Mobile;
import com.golearntolead.jenkins.repository.MobileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJenkinsTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsTwoApplication.class, args);
    }

}
