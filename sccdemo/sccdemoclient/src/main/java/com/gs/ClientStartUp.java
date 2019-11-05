package com.gs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ClientStartUp
 * @Description TODO
 * @Author 逝风无言
 * @Data 2019/9/11 20:27
 * @Version 1.0
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer
@EnableAutoConfiguration
//@RestController
public class ClientStartUp {

//    @Value("${guestname}")
//    String name;2
//
//    @RequestMapping(value = "/",method = RequestMethod.GET)
//    public String sayHello(){
//        return "Hello,"+name;
//    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ClientStartUp.class,args);
    }
}
