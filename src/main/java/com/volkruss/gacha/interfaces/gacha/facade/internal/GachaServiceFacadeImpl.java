package com.volkruss.gacha.interfaces.gacha.facade.internal;

import com.volkruss.gacha.application.GachaService;
import com.volkruss.gacha.interfaces.gacha.facade.GachaServiceFacade;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GachaServiceFacadeImpl implements GachaServiceFacade {

    @Autowired
    private GachaService gachaService;

    @Override
    public List<CharacterDTO> playGacha(int user_id, String type) {
       return this.gachaService.play(1,"hoge");
    }
}
