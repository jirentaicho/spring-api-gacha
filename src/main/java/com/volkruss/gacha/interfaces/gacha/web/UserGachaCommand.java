package com.volkruss.gacha.interfaces.gacha.web;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
/**
 * リクエストの形で受取るにはアクセサメソッドが必須です
 */
public class UserGachaCommand implements Serializable {

	private static final long serialVersionUID = 1L;

	private int user_id;

	private String type;

}
