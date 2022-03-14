package com.volkruss.gacha.interfaces.gacha.web;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserAddGachaCommand implements Serializable {

    private static final long serialVersionUID = 1L;

    private int user_id;

    private int amt;
}
