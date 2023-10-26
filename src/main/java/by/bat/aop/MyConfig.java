package by.bat.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("by.bat.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
