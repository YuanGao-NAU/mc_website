package com.example.mc_site.apis;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class getDataFromServer {

    private List<String> onlinePlayer;

    @PostMapping(value="/onlineplayers", produces = "application/json;charset=UTF-8")
    public String receiveOnlinePlayers(@RequestBody JSONObject jsonParam) {
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("datatype", "json");
        result.put("data", jsonParam);

        onlinePlayer = jsonParam.getObject("players", List.class);

        System.out.println(onlinePlayer);

        return result.toJSONString();
    }

    @GetMapping(value="/onlineplayers", produces = "application/json;charset=UTF-8")
    public String sendOnlinePlayers() {
        JSONObject result = new JSONObject();
        result.put("players", onlinePlayer);
        return result.toJSONString();
    }

}
