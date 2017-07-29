

## Synopsis

keytool *[commands]*

#### commands

See Commands. These commands are categorized by task as follows:

* Create or Add Data to the Keystore
    * -gencert
    
        > Generates certificate from a certificate request `#`根据 CSR 文件创建一个证书
        
    * -genkeypair
    
        > Generates a key pair `#`创建密钥对
        
    * -genseckey
    
        > Generates a secret key `#`创建密钥
    
    * -importcert
    
        > Imports a certificate or a certificate chain `#`导入证书或证书链
    
    * -importpassword
    
        > ?
    
* Import Contents From Another Keystore
    * -importkeystore
    
        > Imports one or all entries from another keystore `#`从另一个keystone导入数据
    
* Generate Certificate Request
    * -certreq
    
        > Generates a certificate request `#`生成一个证书请求文件，用于向CA申请证书
    
* Export Data
    * -exportcert

        > Exports certificate `#`导出证书
    
* Display Data
    * -list

        > Lists entries in a keystore `#`列表显示keystore中的全部证书条目
    
    * -printcert

        > Prints the content of a certificate `#`打印证书内容
    
    * -printcertreq

        > Prints the content of a certificate request `#`打印证书请求文件
    
    * -printcrl

        > Prints the content of a CRL file `#`打印已废弃证书列表的内容
    
* Manage the Keystore
    * -storepasswd

        > Changes the store password of a keystore `#`变更密钥库密码
    
    * -keypasswd

        > Changes the key password of an entry `#`变更密钥条目的密码
    
    * -delete

        > Deletes an entry `#`删除一个证书条目
    
    * -changealias

        > Changes an entry's alias `#`变更一个证书条目的别名
    
* Get Help
    * -help

---

## Flow


#### 构建（自签名／根）证书

在构建CSR之前，需要先在密钥库中生成本地数字证书，此时需要提供用户的身份、加密算法、有效期等一些数字证书的基本信息：

````
keytool -genkeypair -keyalg RSA -keysize 1024 -sigalg MD5withRSA -validity 365 -alias www.mydomain.com -keystore ~/my.keystore
````
参数介绍：

- -genkeypair `#`产生密钥对
- -keyalg `#`指定加密算法
- -keysize `#`指定加密长度
- -sigalg `#`指定签名算法
- -validity `#`证书有效期
- -alias `#`证书别名
- -keystore `#`指定密钥库的位置

#### 证书导出

执行了上面的命令后，我们已经生成了一个本地数字证书，虽然还没有经过证书认证机构进行认证，但并不影响使用，我们可以使用相应的命令对证书进行导出。

````
keytool -exportcert -alias www.mydomain.com -keystore ~/my.keystore -file /tmp/my.cer -rfc
````
参数介绍：

- -exportcert `#`执行证书导出
- -alias `#`密钥库中的证书别名
- -keystore `#`指定密钥库文件
- -file `#`导出的文件输出路径
- -rfc `#`使用Base64编码格式输出

--
证书导出后，可以使用打印证书命令查看证书内容：

````
keytool -printcert -file /tmp/my.cer
````
参数介绍：

- -printcert `#`执行证书打印命令
- -file `#`指定证书文件路径

#### 生成并导出CSR文件

如果想得到证书认证机构的认证，需要导出数字证书并签发申请（Cerificate Signing Request），经证书认证机构认证并颁发后，再将认证后的证书导入本地密钥库与信任库。

导出CSR文件命令：

````
keytool -certreq -alias www.mydomain.com -keystore ~/my.keystore -file /tmp/my.csr -v
````

参数介绍：

- -certreq `#`执行证书签发申请导出操作
- -alias `#`证书的别名
- -keystore `#`使用的密钥库文件
- -file `#`输出的CSR文件路径
- -v `#`显示详细情况

导出CSR文件后，便可以到VeriSign、GeoTrust等权威机构进行证书认证了。

**通过keytool，我们也可以使用私有的根证书来给CSR文件颁发证书。**

#### 根据CSR文件（颁发／创建）证书

由CSR创建证书命令

````
keytool -gencert -alias root -infile my.csr -outfile my.cer -keystore ~/my.keystore -rfc
````

参数介绍：

- -gencert `#`执行颁发证书操作
- -rfc `#`使用Base64编码格式输出

#### 证书导入

获得证书认证机构办法的数字证书后，需要将其导入信任库。

导入数字证书的命令：

````
keytool -importcert -trustcacerts -alias www.mydomain.com -file /tmp/my.cer -keystore ~/my.keystore
````

参数介绍：

- -importcert `#`执行导入证书操作
- -trustcacerts `#`将证书导入信任库
- -alias `#`证书别名
- -file `#`要导入的证书文件的路径
- -keystore `#`指定密钥库文件

导入后使用`keytool -list -v -alias www.mydomain.com -keystore ~/my.keystore`查看，会看到完整的证书链。

---

## Sample

````

    # 生成根证书条目root
    keytool -genkeypair -keyalg RSA -alias root -keystore backbone4j.keystore

    # 生成证书条目pms
    keytool -genkeypair -keyalg RSA -alias pms -keystore backbone4j.keystore

    # 由证书条目pms生成CSR文件
    keytool -certreq -alias pms -keystore backbone4j.keystore -v -keypass pmspms -storepass 58058189 -file pms.csr

    # 根据pms的CSR，颁发证书文件
    keytool -gencert -alias root -infile pms.csr -outfile pms.cer -keystore backbone4j.keystore -keypass rootsa -storepass 58058189

    # 查询证书文件的内容信息
    keytool -printcert -file pms.cer

    # 将证书文件导入到密钥库中，生成一条证书条目
    keytool -importcert -trustcacerts -alias clientpms -file pms.cer -keystore backbone4j.keystore

````

---

## keystore格式类型(-storetype)

- JKS
    
    * 扩展名：.jks / .ks
    * 描述：[Java Keystore]密钥库的Java实现版本，provider为SUN
    * 特点：密钥库和私钥用不同的密码进行保护
    
- JCEKS
    
    * 扩展名：.jce
    * 描述：[JCE Keystore]密钥库的JCE实现版本，provider为SUN JCE
    * 特点：相对于JKS安全级别更高，保护Keystore私钥时采用TripleDES
    
- PKCS12
    
    * 扩展名：.p12 / .pfx
    * 描述：[PKCS #12]个人信息交换语法标准
    * 特点：
        1. 包含私钥、公钥及其证书
        2. 密钥库和私钥用相同密码进行保护
    
- BKS
    
    * 扩展名：.bks
    * 描述：Bouncycastle Keystore]密钥库的BC实现版本，provider为BC
    * 特点：基于JCE实现
    
- UBER
    
    * 扩展名：.ubr
    * 描述：[Bouncycastle UBER Keystore]密钥库的BC更安全实现版本，provider为BC
    * 特点：
    

---

## Java keystore证书条目类型

* trustedCertEntry
    
    > 表示由外部导入到密钥库中的、受信任的证书

* PrivateKeyEntry
    
    > 在密钥库生成的证书和密钥


---

## 相关知识

> <mark>_**X.509**_</mark> 是由国际电信联盟（ITU-T）制定的 <mark>_**数字证书标准**_</mark> 。

> <mark>_**PKCS**_</mark> 是由美国RSA数据安全公司及其合作伙伴制定的一组 <mark>_**公钥密码学标准**_</mark> ，其中包括证书申请、证书更新、证书作废表发布、扩展证书内容以及数字签名、数字信封的格式等方面的一系列相关协议。

> X509就是数字证书的标准，规定了数字证书的格式。PKCS，全称是公钥密码标准，总的来说这些标准就是规范指导人们使用公钥算法，大家都遵守一个标准使用起来才没有歧义，pkcs系列实际上最初就是RSA公司(rsa算法发明后申请了专利，成立的公司，当然现在专利已经到期)为了推广使用RSA公钥算法所拟定的标准，后来被大家广泛接受。举个最简单的例子，RSA算法加密一段消息时可能需要补齐(padding)，怎么补有很多种方法，如果没有一个统一标准，大家使用rsa加密数据就无法互通，PKCS#1就是规定了如何做这个padding，还有比如PKCS#8规定了私钥文件如何加密保存等问题。

--

> 以下提供了一些证书之间的转换方法：

> 1. 将JKS转换成PFX

>     可以使用Keytool工具，将JKS格式转换为PFX格式。

>     ````
>     keytool -importkeystore -srckeystore D:\server.jks 
>     -destkeystore D:\server.pfx -srcstoretype JKS -deststoretype PKCS12
>     ````

> 2. 将PFX转换为JKS

>     可以使用Keytool工具，将PFX格式转换为JKS格式。

>     ````
>     keytool -importkeystore -srckeystore D:\server.pfx 
>     -destkeystore D:\server.jks -srcstoretype PKCS12 -deststoretype JKS
>     ````

> 3. 将PEM/KEY/CRT转换为PFX

>     使用OpenSSL工具，可以将密钥文件KEY和公钥文件CRT转化为PFX文件。

>     将密钥文件KEY和公钥文件CRT放到OpenSSL目录下，打开OpenSSL执行以下命令：

>     ````
>     openssl pkcs12 -export -out server.pfx -inkey server.key -in server.crt
>     ````

> 4. 将PFX转换为PEM/KEY/CRT

>     使用OpenSSL工具，可以将PFX文件转化为密钥文件KEY和公钥文件CRT。

>     将PFX文件放到OpenSSL目录下，打开OpenSSL执行以下命令：

>         openssl pkcs12 -in server.pfx -nodes -out server.pem

>         openssl rsa -in server.pem -out server.key

> ** 请注意 ** 此步骤是专用于使用keytool生成私钥和CSR申请证书，并且获取到pem格式证书公钥的情况下做分离私钥使用的，所以在实际部署证书时请使用此步骤分离出来的私钥和申请下来的公钥证书做匹配使用。

> 云盾证书服务统一使用 PEM 格式的数字证书文件。