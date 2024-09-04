package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.LinkedList;

@RestController
@RequestMapping("/pk/")
public class BotInfoController
{
    @RequestMapping("/getbotinfo/")
    public List getBotInfo()
    {
        List <String> list =new LinkedList<>();
        list.add("sword");
        list.add("tiger");
        list.add("apple");
        return list;
    }
}
