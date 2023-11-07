package de.stea1th.wjaxdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WjaxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WjaxDemoApplication.class, args);
        log.info("Hello World!");
    }

}
