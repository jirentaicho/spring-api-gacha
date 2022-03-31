package com.volkruss.gacha.application.impl;

import com.volkruss.gacha.LogEventPublisher;
import com.volkruss.gacha.application.GachaService;
import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.usecase.GachaAction;
import com.volkruss.gacha.domain.usecase.UserDataAction;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;
import com.volkruss.gacha.interfaces.gacha.facade.internal.mapper.CharacterDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GachaServiceImpl implements GachaService {

    @Autowired
    private LogEventPublisher logEventPublisher;

    @Autowired
    private UserDataAction userDataAction;

    @Autowired
    private GachaAction gachaAction;

    @Override
    public List<CharacterDTO> play(int user_id, String gachaType) {
        // ユーザーが石を利用する
        this.userDataAction.useStone(user_id);
        // ガチャを引く
        List<Character> result = this.gachaAction.getCharacters();
        // イベントの発火
        this.logEventPublisher.call("ガチャ石を利用しました。使用数 : "+ 3000 + "使用ガチャ" + gachaType);
        // View用のフォーマットに変換して返却する
        return new CharacterDTOMapper().toDTOList(result);
    }
}
