<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>stark-spring-springmvc-mybatis-demo</title>
</head>
<body>
	<h2>示例项目名称：stark-spring-springmvc-mybatis-demo</h2>
	<h4>文章链接：<a href="http://www.litianhua.net/blog/ssm-maven.html" target="_blank">http://www.litianhua.net/blog/ssm-maven.html</a></h4>
	<h4>简述：本项目主要用于SSM框架搭建的初步参考和学习。包含如何使用SpringMVC，如何将MyBatis托管于Spring以及如何使用初步使用MyBatis。</h4>
	<fieldset>
		<legend>调用测试说明：</legend>
		<ul>
			<li>1.新增User，在浏览器中输入URL：&lt;项目路径&gt;/user/addUser.do?name=test&pwd=123456，会返回结果页面，可测试页面的跳转及新增功能。</li>
			<li>2.根据ID获取一个User，在浏览器中输入URL：&lt;项目路径&gt;/user/getUser.do?id=，会以JSON的格式显示。</li>
			<li>3.获取所有的User，在浏览器中输入URL：&lt;项目路径&gt;/user/getUserlist.do，会以JSON的格式显示。</li>
		</ul>
	</fieldset>
	<h3>作者：stark</h3>
	<h3>个人主页：<a href="http://www.litianhua.net/" target="_blank">http://www.litianhua.net/</a></h3>
	<h3>github：<a href="https://github.com/litianhua/" target="_blank">https://github.com/litianhua/</a></h3>
	<h3>Git@OSC：<a href="http://git.oschina.net/skyli/" target="_blank">http://git.oschina.net/skyli/</a></h3>
</body>
</html>