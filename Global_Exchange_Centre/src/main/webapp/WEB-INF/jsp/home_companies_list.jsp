<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  	
<%@ page import="com.example.demo.model.CompanyShare"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Companies Share Price</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <a href="AddCompany" class="btn btn-sm btn-primary">Add Company</a>
    <div align="center">
    

        <table class="table table-bordered table-stripped">
            <thead>
            <tr>
                <th>CompanyId</th>
                <th>CompanyName</th>
                <th>SharePrice</th>
            </tr>
            </thead>
            <tbody>
                   <!--  <%
                        Iterable<CompanyShare> transactions = (Iterable<CompanyShare>) request.getAttribute("listofcompanies");
                        for (CompanyShare transaction : transactions) {
                    %>
                 
                     
                    
                    <tr>
                        <td><%=transaction.getCompanyId()%>
                        </td>
                        <td><%=transaction.getCompanyName()%>
                        </td>
                        <td><%=transaction.getSharePrice()%>
                        </td>
                        <td>
                          <td>
                                 <a href="delete-company?CompanyId=${transaction.getCompanyId()}" >delete</a>
                                 |
                                 <a href="${templink}">Update</a>                                              
                          </td> 
                        
                    </tr>
                    <%
                        }
                    %>-->
                     <c:forEach var="companylist" items="${listofcompanies}"> 
                         <tr>
                             <td> ${companylist.companyId}</td>
                             <td> ${companylist.companyName}</td>
                             <td> ${companylist.sharePrice}</td>
                              <td>
                                 <a href="delete-company?CompanyId=${companylist.companyId}" >delete</a>
                                 |
                                 <a href="update-company?CompanyId=${companylist.companyId}">Update</a>                                              
                          </td> 
                        
                         </tr>
                     </c:forEach>
                    </tbody>
        </table> 

    </div>
</body>
</html>