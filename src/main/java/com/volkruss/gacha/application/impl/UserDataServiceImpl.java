package com.volkruss.gacha.application.impl;

import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import com.volkruss.gacha.interfaces.gacha.web.NotEnoughException;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl {
    @Autowired
    UserDataRepository userDataRepository;

    public void hoge(){
        UserData userData = this.userDataRepository.findById(user_id);
        if(!userData.useStone(3000)){
            throw new NotEnoughException();
        }
        this.userDataRepository.save(userData);
    }

}