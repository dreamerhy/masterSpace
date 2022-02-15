package com.yb.masterspace.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EnableSwagger2
@SpringBootApplication(scanBasePackages ={"com.yb.masterspace", "com.yb.masterspace.common"})
@MapperScan(basePackages ={"com.yb.masterspace.system.dao", "com.yb.masterspace.common"})
public class SystemApplication {

    @PostConstruct
    void setDefaultTimezone(){
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }


    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

}
