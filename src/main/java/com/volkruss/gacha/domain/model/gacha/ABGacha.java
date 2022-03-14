package com.volkruss.gacha.domain.model.gacha;

import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.shared.ValueObject;

import java.util.List;

/**
 * これは使わないかも
 *
 */
public abstract class ABGacha implements ValueObject<ABGacha> {

	protected List<Character> characters;

	abstract Character getCharacter();

	abstract List<Character> getCharaceters();

}