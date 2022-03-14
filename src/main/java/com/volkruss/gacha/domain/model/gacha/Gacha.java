package com.volkruss.gacha.domain.model.gacha;

import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.shared.ValueObject;

import java.util.List;

public interface Gacha extends ValueObject<Gacha> {

    /**
     * キャラクターを取得します。
     *
     * @return
     */
    public Character getCharacter();

    /**
     * キャラクターを複数取得します。
     *
     * @return
     */
    public List<Character> getCharaceters();

    public static enum GachaType {
        NormalGacha,
    }
}
