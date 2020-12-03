<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/3
  Time: 9:58   boostrap(css)  jQuery(javascript)
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>所有学生！！！</h1>
   <table>
       <tr>
           <td>姓名</td><td>年龄</td><td>性别</td>
       </tr>
       <c:forEach items="${students}" var="student">
           <tr>
               <td>${student.name}</td>
               <td>${student.age}</td>
               <td>${student.sex}</td>
           </tr>
       </c:forEach>
   </table>
</body>
</html>
