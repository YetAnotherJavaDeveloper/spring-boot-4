package org.yajd.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.SemanticApiVersionParser;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer.setDefaultVersion("1.0.0")
                .addSupportedVersions("1.0.0", "1.0.1", "1.0.2", "2.0.0")
                .useRequestParam("version")
                .setVersionParser(new SemanticApiVersionParser());
    }
}
