package com.volkruss.gacha.application.impl;

import com.volkruss.gacha.application.GachaService;
import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.model.character.CharacterRepository;
import com.volkruss.gacha.domain.model.gacha.Gacha;
import com.volkruss.gacha.domain.model.gacha.NormalGacha;
import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;
import com.volkruss.gacha.interfaces.gacha.facade.internal.mapper.CharacterDTOMapper;
import com.volkruss.gacha.interfaces.gacha.web.NotEnoughException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GachaServiceImpl implements GachaService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public List<CharacterDTO> play(int user_id, String gachaType) {

        UserData userData = this.userDataRepository.findById(user_id);
        if(!userData.useStone(3000)){
            throw new NotEnoughException();
        }

        this.userDataRepository.save(userData);
        List<Character> characters = this.characterRepository.getCharacters();
        // TODO factory
        Gacha gacha = new NormalGacha(characters);

        List<Character> result = gacha.getCharaceters();
        CharacterDTOMapper mapper = new CharacterDTOMapper();
        return mapper.toDTOList(result);
    }
}
