package com.tyd.controller;

import com.tyd.model.Message;
import com.tyd.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tyd on 2017-7-14.
 */
@RestController
@RequestMapping("/message")
public class MessageController {


    @Autowired
    private MessageService messageService;

    @GetMapping("/list")
    public List<Message> list() {
        return messageService.getMesageList();
    }

    @GetMapping("/getById/{id}")
    public Message getById(@PathVariable("id")int id){
        return messageService.getMessageById(id);
    }

}
