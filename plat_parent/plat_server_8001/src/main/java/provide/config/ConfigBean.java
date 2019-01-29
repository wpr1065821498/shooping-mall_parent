package provide.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2028, Chong Qing itsource.cn
 * FileName: ConfigBean.java
 * introduce：
 *
 * @author solargen
 * @version 1.00
 * @Date 2019/1/26
 */
@SpringBootConfiguration
@EnableSwagger2//启动swagger生成接口文档
public class ConfigBean {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //需要生成接口文档的包（controller所在的包）
                .apis(RequestHandlerSelectors.basePackage("provide.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("永和购物平台服务api")
                .description("平台服务接口文档说明")
                .contact(new Contact("wpr", "", " 123@itsource.cn"))
                .version("1.0")
                .build();
    }

}
