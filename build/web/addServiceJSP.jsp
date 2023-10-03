<%-- 
    Document   : addServiceJSP
    Created on : 18 Mar 2022, 9:36:13 pm
    Author     : tanya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Add new Service
        </h1>
        <form method="post" action="addServiceServlet">
        
            <p>
                <label>Service Name: </label><br>
                <input type="text" name="serviceName" size="50"/>
            </p>
            
            <p>
                <label>Service Description: </label><br>
                <textarea name="serviceDesc" id="serviceDesc" cols="50" rows="8" required></textarea>
            </p>
            
            <p>
                <label>Service Included: </label><br>
                <textarea name="serviceIncluded" id="serviceIncluded" cols="50" rows="8" required></textarea>
            </p>
            
            <p>
                <label>Service Details: </label><br>
                <textarea name="serviceDetails" id="serviceDetails" cols="50" rows="8" required></textarea>
            </p>
            
            <p>
                <label>Service Preparation Time: </label><br>
                             
                <input type="number" id="servicePrepTime" name="servicePrepTime1" min="1" max="5"> hour

               
                
            </p>
            
            <p>
                <label>Service Price: </label><br>
                <label><input type="number" step="0.01" id="serviceCost" name="serviceCost"></label>
            </p>
            
            <!--<p>
                <label>Select Image:</label>
                <input type="file" id="img" name="img" accept="image/*">
                
            </p>
            -->
            <input type="submit">
        
        </form>

        
        
    </body>
</html>
