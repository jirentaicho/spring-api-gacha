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

# cors

```
Access to fetch at 'http://localhost:8080/api/addStone' from origin 'http://localhost:8081' has been blocked by CORS policy: Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' header is present on the requested resource. If an opaque response serves your needs, set the request's mode to 'no-cors' to fetch the resource with CORS disabled.
```

解決案としては@CrossOriginアノテーションを付ける方法がある