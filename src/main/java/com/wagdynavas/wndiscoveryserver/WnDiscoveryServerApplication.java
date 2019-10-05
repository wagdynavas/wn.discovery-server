package com.wagdynavas.wndiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WnDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WnDiscoveryServerApplication.class, args);
    }

}
