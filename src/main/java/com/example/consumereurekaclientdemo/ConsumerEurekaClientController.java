package com.example.consumereurekaclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhonglei
 */
@RestController
public class ConsumerEurekaClientController {

    @Autowired
    private ProviderEurekaClientProxy providerEurekaClientProxy;

    @GetMapping(value = "doCallProvider")
    public String doCallProvider(){
        return providerEurekaClientProxy.doCallProvider();
    }
}
