package com.volkruss.gacha.application;

import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;

import java.util.List;

public interface GachaService {
    List<CharacterDTO> play(int user_id, String gachaType);
}
