20150710
1、引入easyUI前端框架。
2、pom文件改动。
3、添加各种工具类。
4、编写：fns.tld，封装常用方法，供前端页面使用。
5、封装公共dao、公共service、公共controller,目标：尽可能封装共用代码，提高后期开发效率。
6、实现日志模块的前后端开发。

20150709
1、规范配置文件：配置文件的命名，数据源配置在config.properties配置文件中。
2、使用声明式事物。
3、引入hibernate二级缓存配置。

20150708
1、spring+springmvc+hibernate环境搭建。
       主要是四个配置文件：pom.xml web.xml applicationContext.xml applicationContext-mvc.xml
2、公共dao的实现，自己编写或直接使用spring自己的工具模版类。
3、新建数据库：afeng。注意编码，不用建表，启动系统会根据实体entity自动创建。
4、编写用户模块，实现用户信息的保存。
5、测试，两种方法进行测试
	第一种：启动系统，访问：localhost:8080/framework/user/save
	第二种：编写Junit测试类：用spring测试框架进行controller和service层的测试。