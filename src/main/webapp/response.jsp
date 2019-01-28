<%@page import="com.teamsankya.shoppingcart.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.foo li {
   float: left;
    width: 30.33%;
    padding: 5px;
}
/* search box */

.button_box2 {
margin:10px auto;
}
/*-------------------------------------*/
.cf:before, .cf:after{
content:"";
display:table;
}
.cf:after{
clear:both;
}
.cf{
zoom:1;
}
/*-------------------------------------*/

.form-wrapper-2 {
width: 500px;
padding: 15px;
background: #555;
-moz-border-radius: 10px;
-webkit-border-radius: 10px;
border-radius: 10px;
-moz-box-shadow: 0 1px 1px rgba(0,0,0,.4) inset, 0 1px 0 rgba(255,255,255,.2);
-webkit-box-shadow: 0 1px 1px rgba(0,0,0,.4) inset, 0 1px 0 rgba(255,255,255,.2);
box-shadow: 0 1px 1px rgba(0,0,0,.4) inset, 0 1px 0 rgba(255,255,255,.2);
}
.form-wrapper-2 input {
width: 350px;
height: 20px;
padding: 10px 5px;
float: left;
font: bold 15px 'Raleway', sans-serif;
border: 0;
background: #eee;
-moz-border-radius: 3px 0 0 3px;
-webkit-border-radius: 3px 0 0 3px;
border-radius: 3px 0 0 3px;
}
.form-wrapper-2 input:focus {
outline: 0;
background: #fff;
-moz-box-shadow: 0 0 2px rgba(0,0,0,.8) inset;
-webkit-box-shadow: 0 0 2px rgba(0,0,0,.8) inset;
box-shadow: 0 0 2px rgba(0,0,0,.8) inset;
}
.form-wrapper-2 input::-webkit-input-placeholder {
color: #999;
font-weight: normal;
font-style: italic;
}
.form-wrapper-2 input:-moz-placeholder {
color: #999;
font-weight: normal;
font-style: italic;
}
.form-wrapper-2 input:-ms-input-placeholder {
color: #999;
font-weight: normal;
font-style: italic;
}
.form-wrapper-2 button {
overflow: visible;
position: relative;
float: right;
border: 0;
padding: 0;
cursor: pointer;
height: 40px;
width: 110px;
font: bold 15px/40px 'Raleway', sans-serif;
color: #fff;
text-transform: uppercase;
background: #D88F3C;
-moz-border-radius: 0 3px 3px 0;
-webkit-border-radius: 0 3px 3px 0;
border-radius: 0 3px 3px 0;
text-shadow: 0 -1px 0 rgba(0, 0 ,0, .3);
}
.form-wrapper-2 button:hover{
background: #FA8807;
}
.form-wrapper-2 button:active,
.form-wrapper-2 button:focus{
background: #c42f2f;
}
.form-wrapper-2 button:before {
content: '';
position: absolute;
border-width: 8px 8px 8px 0;
border-style: solid solid solid none;
border-color: transparent #D88F3C transparent;
top: 12px;
left: -6px;
}
.form-wrapper-2 button:hover:before{
border-right-color: #FA8807;
}
.form-wrapper-2 button:focus:before{
border-right-color: #c42f2f;
}
.form-wrapper-2 button::-moz-focus-inner {
border: 0;
padding: 0;
}
.group:before,
.group:after {
  content: "";
  display: table;
}
.group:after {
  clear: both;
}
.group {
  clear: both;
  *zoom: 1;
}
section {
  float: left;
  margin: 0 1.5%;
  width: 63%;
}
.float-left-child {
  float: left;
}
</style>
</head>
<body>
  <%@include file="searchbar.jsp"%>
  <h1>${res}</h1>
  <ol class="foo">
    <ul><c:forEach items="${users}" var="user" >
 <tr><br>
 <li>
 <div class="row">
  <div class="column">
    <img src="img_snow.jpg" alt="Snow" style="width:50%">
  </div>
 <th>Pid:</th>
<td><c:out value="${user.pId}"/></td>
<br>
<th>Pname:</th>
<td><c:out value="${user.pName}"/></td><br>
<th>Pprice:</th>
<td><c:out value="${user.pPrice}"/></td><br>
<th>Pdesc:</th>
<td><c:out value="${user.pdisc}"/></td><br>
 </c:forEach></li>
    
</ol>
<%@include file="paging.jsp"%>

 <%-- <div id="pagination">

    <c:url value="getdata" var="prev">
        <c:param name="page" value="${page-1}"/>
        <c:param name="name" value="${pname}"/>
    </c:url>
    <c:if test="${page > 1}">
        <a href="<c:out value="${prev}" />" class="pn prev">Prev</a>
    </c:if>

    <c:forEach begin="1" end="${maxPages}" step="1" varStatus="i">
        <c:choose>
            <c:when test="${page == i.index}">
                <span>${i.index}</span>
            </c:when>
            <c:otherwise>
                <c:url value="getdata" var="url">
                    <c:param name="page" value="${i.index}"/>
                    <c:param name="name" value="${pname}"/>
                </c:url>
                <a href='<c:out value="${url}" />'>${i.index}</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>
    <c:url value="getdata" var="next">
        <c:param name="page" value="${page + 1}"/>
        <c:param name="name" value="${pname}"/>
    </c:url>
    <c:if test="${page + 1 <= maxPages}">
        <a href='<c:out value="${next}" />' class="pn next">Next</a>
    </c:if>
</div> --%>

</body>

</html>