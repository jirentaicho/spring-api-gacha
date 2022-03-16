package com.volkruss.gacha.domain.model.character;

import com.volkruss.gacha.domain.shared.ValueObject;
import lombok.Data;

import javax.persistence.*;

/**
 * キャラクターを表すクラス
 */
@Entity
@Table(name="characters")
@Data
public class Character implements ValueObject<Character> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // キャラクターのレア度です
    @Column(name = "lank")
    private int lank;

    // キャラクターの名前です
    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;


}
