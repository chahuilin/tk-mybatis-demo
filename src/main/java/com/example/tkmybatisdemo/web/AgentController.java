package com.example.tkmybatisdemo.web;


import com.example.tkmybatisdemo.entity.Agent;
import com.example.tkmybatisdemo.mapper.opensips.SubscriberMapper;
import com.example.tkmybatisdemo.mapper.voipplatform.AgentMapper;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RequestMapping("agent")
@RestController
@Slf4j
public class AgentController {
    @Resource
    private AgentMapper agentMapper;
    @Resource
    private SubscriberMapper subscriberMapper;

    @GetMapping("{id}")
    public Object findById(@PathVariable Integer id) {
        log.info("popo");
        log.info("test");
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

    @GetMapping("add")
    public Object add() {
        Agent agent = new Agent();
        agent.setEnterpriseId(UUID.randomUUID().toString());
        agent.setUserId("x");
        agentMapper.insertSelective(agent);
        return "ok";
    }


}
