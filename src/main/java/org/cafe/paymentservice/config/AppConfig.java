package org.cafe.paymentservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "org.cafe")
@EntityScan(basePackages = "org.cafe")
@EnableJpaRepositories(basePackages = "org.cafe")
public class AppConfig {

}
