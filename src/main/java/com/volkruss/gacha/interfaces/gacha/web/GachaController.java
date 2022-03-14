package com.volkruss.gacha.interfaces.gacha.web;

import com.volkruss.gacha.interfaces.gacha.facade.GachaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GachaController {

	@Autowired
	private GachaServiceFacade gachaServiceFacade;

	@GetMapping("/api/get")
	public String hoge(@Validated final HogeCommand command,
					   final BindingResult bindingResult
					   ) {
		// まずリクエストをcommandの形で取得します


		// Servicefacadeを利用してサービスクラスに処理を委譲します
		String result = gachaServiceFacade.playGacha();

		// ユーザーIDに紐づくユーザーのガチャ石を確認します
		// これは石の責務
		// Stone.haveStone(int i);

		// 問題なければトランザクションを開始します


		// ランダムでキャラクターを取得します
		//


		// 石を減らします

		// キャラクターを追加する

		//　ガチャ石の使用履歴をログに書き込みます
		// event.writeLog();

		//　結果をJsonで返却します。
		return result;
	}

}
