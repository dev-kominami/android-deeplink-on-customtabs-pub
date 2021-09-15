# Custom TabでDeeplinkをする方法

## 背景
CustomTabを使用してDeeplinkをしようとすると、Deeplinkが起動せずCustomTab内でページ遷移してしまう問題が発生していた。
CustomTabではなく、Chromから同様のリンクをクリックした場合はDeeplinkで特定のアプリを起動することができた。


## 原因・対応

原因は`https`を使用したdeeplinkを設定していたことだった
`app://test.com`といったintent-filterに変更することで、deeplinkが起動した。
また、この方法で`window.onload`でjacascriptでページ遷移した場合でもdeeplinkが起動できることを確認した。