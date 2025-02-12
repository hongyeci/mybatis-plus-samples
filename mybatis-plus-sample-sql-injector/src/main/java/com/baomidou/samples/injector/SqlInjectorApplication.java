package com.baomidou.samples.injector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动器
 *
 * @author nieqiurong 2018/8/11 20:32.
 */
@SpringBootApplication()
public class SqlInjectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlInjectorApplication.class, args);
    }
}
