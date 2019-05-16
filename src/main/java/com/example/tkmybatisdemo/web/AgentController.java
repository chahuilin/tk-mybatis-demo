package com.example.tkmybatisdemo.web;


import com.example.tkmybatisdemo.entity.Agent;
import com.example.tkmybatisdemo.mapper.opensips.SubscriberMapper;
import com.example.tkmybatisdemo.mapper.voipplatform.AgentMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @GetMapping("list")
    public List<Agent> list() {
        return PageHelper.startPage(1, 10).doSelectPage(() -> agentMapper.select(null));
    }

    @GetMapping("2/{id}")
    public Object findById2(@PathVariable Integer id) {
        return subscriberMapper.selectByPrimaryKey(id);
    }


}
