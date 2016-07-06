# APIサンプル・アプリケーション

[![java-8u91](https://img.shields.io/badge/java-8u91-red.svg)]((http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
)
[![postgresql-9.5.3](https://img.shields.io/badge/postgresql-9.5.3-red.svg)]((http://www.enterprisedb.com/products-services-training/pgdownload)
)
[![circleci-status](https://circleci.com/gh/YasuhiroKimesawa/rest-api-noproperties.png?style=shield)]((https://circleci.com/gh/YasuhiroKimesawa/rest-api-noproperties)
)  

## 実行
(MAC)  
./gradlew bootRun  
(Win)  
gradlew.bat bootRun  

## Swagger2(API実行確認）
http://localhost:8080/swagger-ui.html#!

## CircleCI (githubにpushすると自動でビルドとテストを実行、その後herokuにデプロイ)
https://circleci.com/gh/YasuhiroKimesawa/rest-api-noproperties

## heroku staging環境（CircleCIでテストが通った場合のみ反映)
https://rest-api-noproperties.herokuapp.com/swagger-ui.html#!

## タスク管理ツール(Pivotal Taracker)
https://www.pivotaltracker.com/n/projects/1634961  
  
(自分のタスク一覧)左メニューのMyWorkをクリックすると一番右のレーンに表示されます。  
  
## Java インストール
「javac -version」をコマンドプロンプトなどで実行し、version情報が出ないまたは1.8未満の場合は以下を実行

### java8ダウンロード
  
[こちらからダウンロードしてインストール](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)  
  
「Java SE Development Kit 8u91」をダウンロード・インストール  
  
(Win)  
完了後、コマンドプロンプトで「javac -version」と実行し、version情報がまだ出ない場合は以下を実行  
  
・コントロール パネル＞システム＞システムの詳細設定＞環境変数＞ユーザー環境変数のPATHの値にjavacのあるフォルダのpathを追加（恐らくC:\Program Files\Java\jdk1.8.0_92\bin）→すでにほかの値がある場合はカンマ区切りで追加可能。  
  
・コントロール パネル＞システム＞システムの詳細設定＞環境変数＞ユーザー環境変数[JAVA_HOME]を作成し、値をjavacのあるフォルダのpathを追加（恐らくC:\Program Files\Java\jdk1.8.0_92\bin)  
  
(Mac)   
完了後、ターミナルで以下を実行  
  
```
cd ~/
vi .bashrc
```
  
以下を記載  
```
export JAVA_HOME=`/System/Library/Frameworks/JavaVM.framework/Versions/A/Commands/java_home -v "1.8"`
PATH=${JAVA_HOME}/bin:${PATH}
```
記載後『:wq』でviを抜ける  
ターミナルを再起動し「javac -version」を確認する。  

### Postgresqlインストール(注意：Version 9.5.3)  
 (WIN)  
http://www.enterprisedb.com/products-services-training/pgdownload#windows
からダウンロード→インストール  
  
 (MAC)  
```
brew install postgresql
```
  
### pgAdminインストール(3系の最新をインストール)
(WIN)  
https://www.pgadmin.org/download/windows.php  
(MAC)  
https://www.pgadmin.org/download/macosx.php  
  
  
# [java Language](./java-language/ReadMe.md)