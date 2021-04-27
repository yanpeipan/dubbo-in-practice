package cn.napiepnay.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author: yanpeipan
 * @date: 2021/4/27
 */
@EnableAutoConfiguration
public class DubboProviderDemo {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderDemo.class, args);
    }
}