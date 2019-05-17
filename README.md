# tk-mybatis-demo

spring boot和tk-mybatis集成，支持多数据源

# tk-mybatis

通用Mapper都可以极大的方便开发人员。可以随意的按照自己的需要选择通用方法，还可以很方便的开发自己的通用方法。

极其方便的使用MyBatis单表的增删改查。

支持单表操作，不支持通用的多表联合查询。

https://github.com/abel533/Mapper

# PageHelper

Mybatis通用分页插件

https://github.com/pagehelper/Mybatis-PageHelper


# spring-boot-devtools实现热部署

1.找到idea的Preferences -> Build, Execution, Deployment -> Compiler，勾选Build project automatically

2.回到idea正常界面，Mac使用快捷键shift+option+command+/，window上的快捷键是Shift+Ctrl+Alt+/，打开Registry，勾选
compiler.automake.allow.when.app.runningcompiler.automake.allow.when.app.running
通过以上的设置就可以在不重启服务的情况下加载html，但如果修改java文件，服务在几秒后会自动重启，如果不希望服务重启需要在application.properties或application.yml中添加spring.devtools.reatart.enable=false
