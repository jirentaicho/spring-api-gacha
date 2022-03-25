package com.volkruss.gacha.application.impl;

import com.volkruss.gacha.LogEventPublisher;
import com.volkruss.gacha.domain.model.character.Character;
import com.volkruss.gacha.domain.model.character.CharacterRepository;
import com.volkruss.gacha.domain.model.userdata.UserData;
import com.volkruss.gacha.domain.model.userdata.UserDataRepository;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class GachaServiceImplTest {

    // mock
    @Mock
    private UserDataRepository userDataRepository;

    @Mock
    private LogEventPublisher logEventPublisher;

    // アノテーションを付けない場合はmockメソッドを呼びます
    private CharacterRepository characterRepository = mock(CharacterRepository.class);

    // たモックをインジェクトする設定
    @InjectMocks
    private GachaServiceImpl gachaService;

    // 初期化します
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void test_(){
        // モックのメソッドが呼ばれた時、指定の戻り値を返す
        // anyInt()は不特定の数値の引数
        // 引数にintを取るメソッドはanyIntを使います
        // thenReturnは戻り値
        when(this.userDataRepository.findById(anyInt())).thenReturn(UserData.of(9999));

        // any()はnull
        when(this.userDataRepository.save(any())).thenReturn(null);

        when(this.characterRepository.getCharacters()).thenReturn(List.of(
                Character.of(1,"御坂妹","hoge"),
                Character.of(2,"劇場版御坂妹","fuga"),
                Character.of(3,"ナース御坂妹","hoga")
        ));

        // voidのメソッドをモックする場合
        doNothing().when(this.logEventPublisher).call(any());

        List<CharacterDTO> dto = this.gachaService.play(1,"test");

        //　メソッドが呼ばれた回数を検証する
        // 1回であること
        verify(this.userDataRepository,times(1)).findById(anyInt());
        // times(1)は省略可能
        verify(this.userDataRepository).save(any());
    }

}