package com.tyd.dao;

import com.tyd.model.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tyd on 2017-7-14.
 */
@Repository
public interface MessageDao {

    List<Message> getMessageList();

    Message getMessageById(@Param("id")int id);

}
