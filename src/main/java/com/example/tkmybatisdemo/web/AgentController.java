package com.example.tkmybatisdemo.web;


import com.example.tkmybatisdemo.entity.Subscriber;
import com.example.tkmybatisdemo.mapper.opensips.SubscriberMapper;
import com.example.tkmybatisdemo.mapper.voipplatform.AgentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("agent")
@RestController
public class AgentController {
    @Resource
    private AgentMapper agentMapper;
    @Resource
    private SubscriberMapper subscriberMapper;

    @GetMapping("{id}")
    public Object findById(@PathVariable Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }

    @GetMapping("2/{id}")
    public Object findById2(@PathVariable Integer id) {
        Subscriber agent = subscriberMapper.selectByPrimaryKey(id);
        return subscriberMapper.selectByPrimaryKey(id);
    }


}
