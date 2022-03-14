package com.volkruss.gacha.interfaces.gacha.facade;

import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;

import java.util.List;

public interface GachaServiceFacade {
    // Gacha引く
    List<CharacterDTO> playGacha(int user_id, String type);

    // 石を足す
    UserData addStone(int user_id, int amt);
}
