package org.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("org.aop")
@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
}
