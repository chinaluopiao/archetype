* web模块依赖biz模块
* biz模块依赖manager和service模块
* service模块依赖dao模块
* manager模块依赖api、common和service模块
* web模块可直接对biz、manager和service层直接进行操作
* manager模块用于提供和消费dubbo服务

自定义骨架工程：  
1.在根目录archetype执行命令：mvn archetype:create-from-project  
2.修改target/generated-sources/archetype的web模块pom文件，修改finalName、另修改archetype-metadata.xml
3.进入目录target/generated-sources/archetype后执行mvn clean install  
4.在需要生成项目的地方执行命令：mvn archetype:generate -DarchetypeCatalog=local