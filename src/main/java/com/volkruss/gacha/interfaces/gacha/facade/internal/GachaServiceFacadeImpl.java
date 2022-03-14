package com.volkruss.gacha.interfaces.gacha.facade.internal;

import com.volkruss.gacha.application.GachaService;
import com.volkruss.gacha.interfaces.gacha.facade.GachaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class GachaServiceFacadeImpl implements GachaServiceFacade {

    @Autowired
    private GachaService gachaService;

    @Override
    public String playGacha() {

        this.gachaService.play(1,"hoge");


        return "ガチャをゲットしました";
    }
}
