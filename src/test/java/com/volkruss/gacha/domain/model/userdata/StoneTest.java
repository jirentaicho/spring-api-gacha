package com.volkruss.gacha.domain.model.userdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneTest {
    @Test
    public void test_CanGacha(){
        assertTrue(checkCanGacha(3000,3000));
        assertFalse(checkCanGacha(2999,3000));
        assertTrue(checkCanGacha(3001,3000));
        assertTrue(checkCanGacha(0,0));
        assertTrue(checkCanGacha(3000,0));
    }
    private boolean checkCanGacha(int amt, int sub){
        return makeStone(amt).canGacha(sub);
    }
    private Stone makeStone(int amt){
        Stone stone = new Stone();
        stone.add(amt);
        return stone;
    }
}