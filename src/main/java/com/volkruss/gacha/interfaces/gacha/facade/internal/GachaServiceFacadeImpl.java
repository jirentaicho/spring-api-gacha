package com.volkruss.gacha.interfaces.gacha.facade.internal;

import com.volkruss.gacha.interfaces.gacha.facade.GachaServiceFacade;
import org.springframework.stereotype.Service;

@Service
public final class GachaServiceFacadeImpl implements GachaServiceFacade {
    @Override
    public String getGacha() {
        return "ガチャをゲットしました";
    }
}
