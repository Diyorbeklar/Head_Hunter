<%@ page import="Example.model.Country" %>
<%@ include file="head.jsp"%>
<%@ include file="navbar.jsp"%>
<%Country country = (Country) request.getAttribute("countryDele");%>
<br>

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

<br>
<a class="btn btn-outline-danger w-25" href="<%=request.getContextPath()%>/country" role="button">BACK</a>
<a class="btn btn-outline-primary w-25" href="<%=request.getContextPath()%>/deletebutton/<%=country.getId()%>" role="button">DELETE</a>
<%@ include file="footer.jsp"%>