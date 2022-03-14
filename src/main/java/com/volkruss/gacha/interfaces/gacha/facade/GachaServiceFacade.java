package com.volkruss.gacha.interfaces.gacha.facade;

import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;

import java.util.List;

public interface GachaServiceFacade {
    // Gacha引く
    List<CharacterDTO> playGacha(int user_id, String type);
}
