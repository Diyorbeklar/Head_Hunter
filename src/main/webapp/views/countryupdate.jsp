<%@ page import="Example.model.Country" %>
<%@ include file="head.jsp"%>
<%@ include file="navbar.jsp"%>
<%Country country = (Country) request.getAttribute("countryup");%>
<form action="countryupdated/<%=country.getId()%>">

    <div class="container-fluid mb-3">
        <div class="box">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">COUNTRY</label>
                <input type="text" placeholder="<%=country.getName()%>" class="form-control" name="countryname" id="exampleInputEmail1" aria-describedby="emailHelp">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>

    </div>
</form>
<h1><%=request.getAttribute("success")%></h1>
<%@ include file="footer.jsp"%>
