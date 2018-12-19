<%-- 
    Document   : view
    Created on : 19 Dec, 2018, 11:29:33 PM
    Author     : gulfa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            ${greeting}
            ${stringList}
            ${stringlist2}
            <%--this maps to the model attribute greeting in the controller.--%>
        </h1>
        <div align="center">
            <table border="1">
                <c:forEach items="${stringList}" var="elt">
                    <tr>  
                        <td>
                            <div><c:out value="${elt}"/></div>
                        </td>
                    </tr>
                </c:forEach> 

            </table>
        </div>
    </body>
</html>
