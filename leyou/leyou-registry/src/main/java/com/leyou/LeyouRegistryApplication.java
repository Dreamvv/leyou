package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yd
 * @date 2019/11/18 10:05
 */
@SpringBootApplication
@EnableEurekaServer
public class LeyouRegistryApplication {

      public static void main(String[] args) {
            SpringApplication.run(LeyouRegistryApplication.class, args);
      }
}
