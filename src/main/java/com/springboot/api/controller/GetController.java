package com.springboot.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "hello";
    }

    @GetMapping(value = "/request1")
    public String getRequest1(@RequestParam Map<String, Object> param){

        StringBuilder sb = new StringBuilder();

        log.info(String.valueOf(param.get("name")) + " / " + String.valueOf(param.get("age")));

        param.entrySet().forEach(map ->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        String result = "이름은 " + String.valueOf(param.get("name")) + " 이고, 나이는 " + String.valueOf(param.get("age")) + " 이시네요!";
        log.info(result);
        log.info(sb.toString());

        return result;
    }

}
