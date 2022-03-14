package com.volkruss.gacha.domain.model.userdata;

import com.volkruss.gacha.domain.shared.Entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name="userdatas")
@Getter
@Setter
public class UserData implements Entity<UserData> {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Id
    @Column(name = "user_id")
    private int user_id;

    @Embedded
    private Stone stone;

    /*
    public UserData(int user_id, Stone stone){
        this.user_id = user_id;
        this.stone = stone;
    }
     */

    /**
     * ガチャ石がマイナスにならない場合はガチャ石を使用します
     *
     * @param sub
     * @return
     */
    public boolean useStone(int sub){
        if(this.stone.canGacha(sub)){
            this.stone = this.stone.sub(sub);
            return true;
        }
        return false;
    }

}
