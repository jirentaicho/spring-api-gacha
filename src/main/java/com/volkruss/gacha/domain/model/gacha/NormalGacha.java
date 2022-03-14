package com.volkruss.gacha.domain.model.gacha;

import com.volkruss.gacha.domain.model.character.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class NormalGacha implements Gacha{

    private List<Character> characters = new ArrayList<>();

    public NormalGacha(List<Character> characters){
        this.characters.addAll(characters);
    }

    @Override
    public Character getCharacter() {
        this.NormalShuffle();
        return this.characters.stream()
                .findFirst()
                .get();
    }

    @Override
    public List<Character> getCharaceters() {
        //　普通の10連ガチャです
        this.NormalShuffle();
        return this.characters.stream()
                .limit(2)
                .collect(Collectors.toList());
    }

    // シャッフルします
    private void NormalShuffle(){
        Collections.shuffle(this.characters);
    }

}
