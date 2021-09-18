package com.yt.meituan.common.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration 注解用于标注一个配置类
 * @EnableSwagger2 注解用于开启 Swagger。
 * @Profile({"dev","test"}) 注解用于表示 dev、test 环境下可以使用 Swagger，prod 环境下不行。
 */
@Configuration
@EnableSwagger2
//@Profile({"dev", "test"})
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 加了ApiOperation注解的类，才会生成接口文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 指定包下的类，才生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.yt.meituan"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后台管理系统文档")
                .description("后台管理系统文档")
                .termsOfServiceUrl("http://www.xiaojiji.top/")
                .version("1.0.0")
                .build();
    }
}
