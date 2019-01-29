package EurekaServer_7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启用的是eureka的服务器
public class EurekaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class, args);
    }
}
