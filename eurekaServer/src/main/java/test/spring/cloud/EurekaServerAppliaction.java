package test.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wujianfei on 2017/7/21.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppliaction {

    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaServerAppliaction.class)
                .web(true).run(args);
    }
}
