package com.rodrigo.land.route.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;

@Configuration
@Import(BeanValidatorPluginsConfiguration.class)
public class SpringFoxConfiguration {

}
