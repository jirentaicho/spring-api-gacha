package com.volkruss.gacha.infrastructure.persistence.database;

import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataJpaRepository;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class UserDataRepositoryImpl implements UserDataRepository {

    @Autowired
    private UserDataJpaRepository userDataJpaRepository;

    @Override
    public UserData findById(int user_id) {
        return this.userDataJpaRepository.findById(user_id).get();
    }

    @Override
    @Transactional
    public UserData save(UserData userData) {
        return this.userDataJpaRepository.save(userData);
    }


    // spyの勉強のために用意しているだけです
    public String getName(){
        return "御坂妹";
    }


}
