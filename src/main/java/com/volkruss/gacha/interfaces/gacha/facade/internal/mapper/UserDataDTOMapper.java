package com.volkruss.gacha.interfaces.gacha.facade.internal.mapper;

import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.interfaces.gacha.facade.dto.UserDataDTO;

public class UserDataDTOMapper {

    public UserDataDTO toDTO(UserData userData){
        return new UserDataDTO(userData.getStoneAmt());
    }

}
