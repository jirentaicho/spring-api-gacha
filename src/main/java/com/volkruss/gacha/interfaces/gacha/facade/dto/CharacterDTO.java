package com.volkruss.gacha.interfaces.gacha.facade.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
/**
 * クラスをJSONとして返却する際には、Getterが必要になります。
 */
public final class CharacterDTO {

	private final int lank;

	private final String name;

}
