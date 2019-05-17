# tk-mybatis-demo

spring boot和tk-mybatis集成

支持多数据源


# spring-boot-devtools实现热部署

1.找到idea的Preferences -> Build, Execution, Deployment -> Compiler，勾选Build project automatically

2.回到idea正常界面，Mac使用快捷键shift+option+command+/，window上的快捷键是Shift+Ctrl+Alt+/，打开Registry，勾选
compiler.automake.allow.when.app.runningcompiler.automake.allow.when.app.running
通过以上的设置就可以在不重启服务的情况下加载html，但如果修改java文件，服务在几秒后会自动重启，如果不希望服务重启需要在application.properties或application.yml中添加spring.devtools.reatart.enable=false
