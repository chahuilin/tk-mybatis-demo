package com.example.tkmybatisdemo.web;


import com.example.tkmybatisdemo.mapper.AgentMapper;
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

    @GetMapping("{id}")
    public Object findById(@PathVariable Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }


}
