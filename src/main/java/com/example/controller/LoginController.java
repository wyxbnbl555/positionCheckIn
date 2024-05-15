package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoginController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/login")
    public String login(@RequestParam("code") String code) {
        String appId = "wxc485d16270288d6d";
        String appSecret = "c629306cfc08e6154c154295b9fdfb64";

        // 构建请求URL
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId +
                "&secret=" + appSecret + "&js_code=" + code + "&grant_type=authorization_code";

        // 发送HTTP请求并获取响应
        String response = restTemplate.getForObject(url, String.class);

        // 返回响应给前端
        return response;
    }
}

