<%@ page import="Example.model.Country" %>
<%@ include file="head.jsp"%>
<%@ include file="navbar.jsp"%>
<% Country country = (Country) request.getAttribute("countries");%>

<div class="container-fluid mb-3">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">COUNTRY NAME</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row"><%=country.getId()%></th>
            <td><%=country.getName()%></td>
        </tr>
        </tbody>
    </table>
</div>
<%@ include file="footer.jsp"%>