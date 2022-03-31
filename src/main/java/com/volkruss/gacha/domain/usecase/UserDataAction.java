package com.volkruss.gacha.domain.usecase;

import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import com.volkruss.gacha.interfaces.gacha.web.NotEnoughException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDataAction {

    @Autowired
    UserDataRepository userDataRepository;

    public void useStone(int user_id){
        UserData userData = this.userDataRepository.findById(user_id);
        if(!userData.useStone(3000)){
            throw new NotEnoughException();
        }
        this.userDataRepository.save(userData);
    }

}
