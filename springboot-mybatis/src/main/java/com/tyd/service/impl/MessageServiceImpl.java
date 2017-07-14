package com.tyd.service.impl;

import com.tyd.dao.MessageDao;
import com.tyd.model.Message;
import com.tyd.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tyd on 2017-7-14.
 */
@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Message> getMesageList() {
        return messageDao.getMessageList();
    }

    @Override
    public Message getMessageById(int id) {
        return messageDao.getMessageById(id);
    }
}
