package zull_9527.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2028, Chong Qing itsource.cn
 * FileName: ConfginBean.java
 * introduce：
 *
 * @author solargen
 * @version 1.00
 * @Date 2019/1/26
 */
@SpringBootConfiguration
@EnableSwagger2
public class ConfginBean {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("永和购物电商平台系统")
                .description("永和电商平台接口文档说明")
                .contact(new Contact("wpr", "", "123@itsoruce.cn"))
                .version("1.0")
                .build();
    }

}
