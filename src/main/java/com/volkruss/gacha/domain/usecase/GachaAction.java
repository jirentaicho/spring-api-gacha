package com.volkruss.gacha.domain.usecase;

import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.model.character.CharacterRepository;
import com.volkruss.gacha.domain.model.gacha.Gacha;
import com.volkruss.gacha.domain.model.gacha.NormalGacha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GachaAction {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> getCharacters(){
        List<Character> characters = this.characterRepository.getCharacters();
        Gacha gacha = new NormalGacha(characters);
        return gacha.getCharaceters();
    }
}
