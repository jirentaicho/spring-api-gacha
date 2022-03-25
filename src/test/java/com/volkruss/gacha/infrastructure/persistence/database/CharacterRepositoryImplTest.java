package com.volkruss.gacha.infrastructure.persistence.database;

import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.model.character.CharacterJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;


import static org.mockito.Mockito.*;

class CharacterRepositoryImplTest {

    @Spy
    private CharacterJpaRepository characterJpaRepository;

    @InjectMocks
    private CharacterRepositoryImpl characterRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test(){
        when(this.characterJpaRepository.findAll()).thenReturn(List.of(
                Character.of(1,"欠陥電気御坂妹","url1"),
                Character.of(2,"鋼鉄破り御坂妹","url1")
        ));
        List<Character> list = this.characterRepository.getCharacters();

        verify(this.characterJpaRepository,times(1)).findAll();
    }

}