package com.example.webdemo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author wangxulong
 * @version 20210422
 */
@RestController
@Slf4j
public class IndexController {

    @GetMapping("index")
    public String index() {
        return "hllo";
    }
    @PostMapping("allow")
    public JsonNode allow(@RequestBody JsonNode node){
        log.info("node:{}",node.toString());
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.createObjectNode().put("allow","true");
    }
}
