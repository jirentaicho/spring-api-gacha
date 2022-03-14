# ガチャガチャAPI

ガチャガチャを引くAPIです。  
取得データはdocker/setup/2.sqlの内容です。


# リクエスト

URL : /api/get

以下のようなjsonを投げます

```json
{
    "user_id" : 1,
    "type" : "澁谷かのん"
}
```


# 共通エラー定義方法

シンプルなメッセージ返却

* @RestControllerAdviceを付与したクラスを作成する
* ResponseEntityExceptionHandlerを継承する
* @ExceptionHandlerに対象とするクラスを指定するメソッドの作成
  * ~~戻り値はResponseEntity<Object>にする~~  
  * 戻り値はMap<String, Object>にする
* 対象クラスはRuntimeExceptionを継承する
* 対象クラスをスローする