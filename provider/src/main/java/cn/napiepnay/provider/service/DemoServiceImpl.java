package cn.napiepnay.provider.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author: yanpeipan
 * @date: 2021/4/27
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
