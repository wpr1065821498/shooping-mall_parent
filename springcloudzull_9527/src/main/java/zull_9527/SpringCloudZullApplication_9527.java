package zull_9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //网关代理
public class SpringCloudZullApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZullApplication_9527.class, args);
    }
}
