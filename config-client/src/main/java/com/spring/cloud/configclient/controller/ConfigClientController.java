package com.spring.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @ProjectName config
 * @Description: TODO
 * @date 2018/12/13 17:07
 */

@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${configText}")
    private String text;

    @GetMapping("getConfigText")
    public String from(){
        return text;
    }
}
