package com.volkruss.gacha.infrastructure.persistence.database;

import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataJpaRepository;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDataRepositoryImpl implements UserDataRepository {

    @Autowired
    private UserDataJpaRepository userDataJpaRepository;

    @Override
    public UserData findById(int user_id) {
        return this.userDataJpaRepository.findById(user_id).get();
    }
}
