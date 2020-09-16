package co.nz.springBootDemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("co.nz.springBootDemo.mapper")
public class MyBatisConfig {
}
