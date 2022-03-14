package com.volkruss.gacha.interfaces.gacha.facade.internal.mapper;

import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterDTOMapper {

    public CharacterDTO toDTO(Character character){
        return new CharacterDTO(character.getLank(),character.getName());
    }

    public List<CharacterDTO> toDTOList(List<Character> characters){
        return characters.stream().map(this::toDTO).collect(Collectors.toList());
    }


}
