#!/usr/bin/env bash

# keytool usage.

:<<!
1。创建非对称密钥对
keytool -genkeypair
不仅生成密钥对，同时对公钥包装，生成自签名的证书。

keytool -genkeypair -alias root -keyalg RSA -keystore backbone4j.keystore
创建一个别名为fRoot的证书条目，该条目存放在名为backbone4j.keystore的密钥库中，若backbone4j.keystore密钥库不存在则创建。
params：
    -genkeypair：生成一对非对称密钥
    -alias：指定密钥对的别名，该别名是公开的。
    -keyalg：使用指定的加密算法。
    -keystore：密钥库的路径及名称，不指定的话，默认在操作系统的用户目录下生成一个".keystore"的文件。

PS：
    生成非对称加密的私钥／公钥。
    -alias XXX 用于对新建的密钥对条目进行命名。
    密钥对条目保存在keystore中
!
keytool -genkeypair -alias root -keyalg RSA -keystore backbone4j.keystore

:<<eof
2。查看密钥库条目
keytool -list -keystore backbone4j.keystore
查看名为backbone4j.keystore的证书库中的证书条目。

params:
    -keystore: 指定某一证书库名，以查看。
    -v: 看到更详细的内容。
    -rfc: 将以可打印的编码格式输出证书条目。
    -alias: 查看某一条目名的证书

eof

:<<eof
3。从密钥库中导出条目，来生成证书文件

keytool -export -alias web -file web.crt -keystore backbone4j.keystore
keytool -exportcert -alias web -file web.crt -keystore backbone4j.keystore

将名为backbone4j.keystore的证书库中别名为web的证书条目导出到证书文件web.crt中

eof

:<<eof
4。导入证书文件的信息到密钥库
keytool -import -keystore backbone4j.keystore -file web.crt
将证书文件web.crt导入到名为backbone4j的证书库中。

eof

:<<eof
5。查看证书文件信息
keytool -printcert -file web.crt
查看证书文件web.crt的信息

eof

:<<eof
6。删除密钥库中的条目
keytool -delete -keystore backbone4j.keystore -alias web
删除密钥库backbone4j中名为web的条目

eof

:<<eof
7。修改密钥库条目的口令
交互方式：
keytool -keypasswd -alias web -keystore backbone4j.keystore

非交互方式：
keytool -keypasswd -alias web -keypass finn0918 -new june0127 -storepass 58058189 -keystore backbone4j.keystore
将密钥库backbone4j中别名为web的条目，密码从finn0918改为june0127，keystore访问密码为58058189

eof
