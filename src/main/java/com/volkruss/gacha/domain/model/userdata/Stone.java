package com.volkruss.gacha.domain.model.userdata;

import com.volkruss.gacha.domain.shared.Entity;
import com.volkruss.gacha.domain.shared.ValueObject;

import javax.persistence.Embeddable;


@Embeddable
public class Stone implements ValueObject<Entity> {

    private int stone_amt;


    /**
     *
     * 所持している石の数からガチャが引けるかどうか判定します
     *
     * @param sub マイナスされる石の数
     * @return 判定結果
     */
    public boolean canGacha(int sub){
        if(0 > stone_amt - sub ){
            return false;
        }
        return true;
    }

    /**
     * 石をマイナスします
     *
     * @param sub
     * @return
     */
    public Stone sub(int sub){
        this.stone_amt -= sub;
        return this;
    }
}
