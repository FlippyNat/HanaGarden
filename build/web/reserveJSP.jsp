<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>penis</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form method="post" action="reservation" >
            <h3>Address</h3>
             
                <p><label>House Number, Building, Street Name</label>
                    <input type="text" name="address1" size="100" /></p>
                <p><label>postal code,area</label>
                    <input type="text" name="address2" size="50"/></p>
                <p><label>State</label>
                    <input type="text" name="address3" size="50"/></p>
                
                
                <p><label>Reserve date and time</label>
                <input type="datetime-local" name="datetime"/></p>
            
                <%
                    String ID = request.getParameter("serviceID");
                %>
                
                <%=serviceID%>
            <p><input type="submit" value="Submit" />
                <input type="reset" value="Reset" /></p>
        </form>
    </body>
</html>
