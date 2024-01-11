<%@ include file="head.jsp"%>
<%@ include file="navbar.jsp"%>
<form action="countryadded">
    <div class="container-fluid mb-3">
        <div class="box">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">COUNTRY</label>
                <input type="text" class="form-control" name="countryname" id="exampleInputEmail1" aria-describedby="emailHelp">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>

    </div>
</form>
<h1><%=request.getAttribute("success")%></h1>
<%@ include file="footer.jsp"%>

