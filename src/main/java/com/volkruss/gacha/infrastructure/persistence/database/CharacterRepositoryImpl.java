package com.volkruss.gacha.infrastructure.persistence.database;

import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.model.character.CharacterJpaRepository;
import com.volkruss.gacha.domain.model.character.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CharacterRepositoryImpl implements CharacterRepository {

    @Autowired
    private CharacterJpaRepository characterJpaRepository;

    @Override
    public List<Character> getCharacters() {
        return this.characterJpaRepository.findAll();
    }
}
