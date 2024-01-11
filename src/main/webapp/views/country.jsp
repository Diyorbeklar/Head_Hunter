<%@ page import="java.util.List" %>
<%@ page import="Example.model.Country" %>
<%@ include file="head.jsp"%>
<%@ include file="navbar.jsp"%>
<% List<Country> countries = (List<Country>) request.getAttribute("countries");%>
<br>
<a href="<%=request.getContextPath()%>/countryadd">
    <button type="button"  style="margin: 20px" class="btn btn-primary">Country add</button>
</a>
<br>
<div class="container-fluid mb-3">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">COUNTRY NAME</th>
            <th scope="col">FUNCTIONS</th>
        </tr>
        </thead>
        <tbody>
        <% for (Country count : countries){ %>
        <tr>
            <th scope="row"><%=count.getId()%></th>
            <td><%=count.getName()%></td>
            <td>
                <a href="<%=request.getContextPath()%>/countryview/<%=count.getId()%>">view</a>
                <a href="<%=request.getContextPath()%>/countryupdate/<%=count.getId()%>">update</a>
                <a href="<%=request.getContextPath()%>/countrydelete/<%=count.getId()%>">delete</a>
            </td>
        </tr>

        <%}%>

        </tbody>
    </table>
</div>
<%@ include file="footer.jsp"%>
