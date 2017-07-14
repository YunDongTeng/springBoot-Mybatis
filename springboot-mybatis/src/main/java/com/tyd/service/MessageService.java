package com.tyd.service;

import com.tyd.model.Message;

import java.util.List;

/**
 * Created by tyd on 2017-7-14.
 */
public interface MessageService {

    List<Message> getMesageList();

    Message getMessageById(int id);
}
