package com.volkruss.gacha.application.impl;

import com.volkruss.gacha.application.GachaService;
import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.model.character.CharacterRepository;
import com.volkruss.gacha.domain.model.gacha.Gacha;
import com.volkruss.gacha.domain.model.gacha.NormalGacha;
import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
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
    public void play(int user_id, String gachaType) {

        UserData userData = this.userDataRepository.findById(user_id);

        if(userData.useStone(3000)){
            System.out.println("ok!");
        }

        //　ガチャを作成する
        List<Character> characters = this.characterRepository.getCharacters();
        // TODO factory
        Gacha gacha = new NormalGacha(characters);

        List<Character> result = gacha.getCharaceters();

        System.out.println(result);

    }
}
