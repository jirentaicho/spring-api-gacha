package com.volkruss.gacha.interfaces.gacha.facade.internal;

import com.volkruss.gacha.application.GachaService;
import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import com.volkruss.gacha.interfaces.gacha.facade.GachaServiceFacade;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GachaServiceFacadeImpl implements GachaServiceFacade {

    @Autowired
    private GachaService gachaService;

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public List<CharacterDTO> playGacha(int user_id, String type) {
       return this.gachaService.play(user_id,type);
    }

    @Override
    public UserData addStone(int user_id, int amt) {
        UserData userData = userDataRepository.findById(user_id).addStone(amt);
        return this.userDataRepository.save(userData);
    }
}
