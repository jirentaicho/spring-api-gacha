package com.volkruss.gacha.interfaces.gacha.web;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GachaController {

	@GetMapping("/api/get")
	public String hoge(@Validated final HogeCommand command,
					   final BindingResult bindingResult
					   ) {
		// まずリクエストをcommandの形で取得します


		// Servicefacadeを利用してサービスクラスに処理を委譲します

		// ユーザーIDに紐づくユーザーのガチャ石を確認します

		// 問題なければトランザクションを開始します

		// ランダムでキャラクターを取得します

		// 石を減らします

		// キャラクターを追加する

		//　結果をJsonで返却します。
		return "hogehogehoge";
	}

}
