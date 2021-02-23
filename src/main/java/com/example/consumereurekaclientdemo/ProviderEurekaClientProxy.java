package com.example.consumereurekaclientdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-eureka-client-demo")
public interface ProviderEurekaClientProxy {

    @GetMapping(value = "eureka-client")
    String doCallProvider();
}
