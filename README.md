# Custom TabでDeeplinkをする方法

## 背景
CustomTabを使用してDeeplinkをしようとすると、Deeplinkが起動せずCustomTab内でページ遷移してしまう問題が発生していた。
CustomTabではなく、Chromから同様のリンクをクリックした場合はDeeplinkで特定のアプリを起動することができた。


## 原因・対応

原因は`https`を使用したdeeplinkを設定していたことだった
`app://test.com`といったintent-filterに変更することで、deeplinkが起動した。
また、この方法で`window.onload`でjacascriptでページ遷移した場合でもdeeplinkが起動できることを確認した。

## CustomTabでロードするhtmlのサンプル
以下のようなhtmlが返却される。
```
⚡ ❯ curl https://0l2tjzu2r1.execute-api.ap-northeast-1.amazonaws.com/sample-html

  <html>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <body>
      <h1>Test Page</h1>
      こんにちわ！
    </body>
    <a href="https://sample.commy.com/demo/">link</a></br>
    <button type=“button” onclick="location.href='https://sample.commy.com/'">link</button></br>
    <a href="depplinkoncustomtab://sample.commy.com/demo/">AppLink</a></br>
  <script> window.onload = function() { location.href="depplinkoncustomtab://sample.commy.com/" }  </script>
  </html>%
```