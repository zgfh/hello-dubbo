这是一个通过 spring-boot 运行 dubbo 的 demo，下面为主要操作步骤。

## 本地允许
1. 我们使用 [zookeeper](http://zookeeper.apache.org/) 作为 dubbo 的注册中心，所以你需要安装 zookeeper。如果你嫌麻烦，也可以直接使用我在分支 [zk](https://github.com/RitterHou/hello-dubbo/tree/zk) 下提供的 zookeeper 的压缩文件；
2. 在根目录执行 `mvn clean install`；
3. 在 provider 目录下执行 `mvn clean install`，之后执行命令 `java -jar target/provider-0.0.1-SNAPSHOT.jar` 启动 provider；
4. 在 consumer 目录下执行 `mvn clean package`，之后执行命令 `java -jar target/consumer-0.0.1-SNAPSHOT.jar`；
5. 观察 provider 的输出和 consumer 的输出，发现 consumer 确实调用了 provider 中的方法，远程调用成功。
/Users/zhuzhengguang/.m2/repository/me/hourui/provider/0.0.1-SNAPSHOT/provider-0.0.1-SNAPSHOT.pom
me.hourui:provider:jar:0.0.1-SNAPSHOT:

## docker 方式运行
1.安装docker,docker-compose ，可以官方下载，中国推荐通过这里加速下载：http://get.daocloud.io
2.在根目录执行 `docker-compose up`；

