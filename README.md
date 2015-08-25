# J2EE-Hello-World
you can  find "Hello world Example" for every technology available in j2ee  such as :
jsp,servlet,jsf,web services(soap and rest) .....
if you want participate in this project for new technology please clone this respository, add your hello world example and send a pull request for me.
the project now contains following Hello World Examples: 
1-SOAP Web Service (Annotation based with : @WebService)
2-RESTFULL Web Service
3-WebSocket 
***************************************************************
1-JSF  Hello World
URL : http://localhost:7001/test/faces/hello.xhtml
related java classes : 
	-com.arnia.web.jsf.bean;
related xhtml files : 
	-faces/hello.xhtml
	-faces/welcome.xhtml
related Config : 
see below section in web.xml :
	-"<!-- JSF Config - begin -->"
***************************************************************
2-JSP/Servlet Hello World Guide 
URL : http://localhost:7001/test/jsp/index.jsp
related java classes: 
	-com.arnia.web.servlets.DefaultServlet
	-com.arnia.web.servlets.DefaultServletWithAnnotation
related Config : 
see below section in web.xml  :
	-<!--  Default Web Servlet - begin -->

***************************************************************
3-WebSocket Hello World Guide
URL :http://localhost:7001/test/websocket/chat.html
related java Class  :
	-com.arnia.web.websocket.ChatServer
	
***************************************************************
4- REST/JSON Jersey Web service hello world Guide : 
URL : localhost:7001/test/rest/helloWorld/yourName
related java classes : 
	-com.arnia.web.service.rest.UserRestServices
related Config  :
see below section in web.xml  :
	-<!--  Default Web Servlet - begin -->
	<!-- REST Config - begin -->

***************************************************************
5- SOAP Web service hello world Guide:
URL :http://localhost:7001/test/SoapHelloWorldImpService?wsdl
related java classes : 
	- com.arnia.web.service.soap.SoapHelloWorld
	- com.arnia.web.service.soap.SoapHelloWorldClient
	- com.arnia.web.service.soap.SoapHelloWorldImp
	- com.arnia.web.service.soap.SoapHelloWorldPublisher
