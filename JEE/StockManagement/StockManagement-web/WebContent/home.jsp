<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body style="font-family: arial">
        <h2>Admin Services</h2>
        
        <form action="StockServlet" method="post">
            <h3>Account Management Services</h3>
            <table>
                <tr valign="top">
                    <td>
                        <label for="l1">Item Name</label>  <input type="text" name="itemName"   value=""/> <br/>
                    </td>
                </tr>
                <tr>
                    <td>
                      <label for="12">Stock Count</label> <input type="text" name="stockCount"    value=""/>  <br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" name="addStock"  value="Add Stock"/> &nbsp;&nbsp;
                        <input type="submit" name="viewStock"  value="View Stock"/>
                    </td>
                </tr>
                 <tr>
                    <td>
                      <label for="13">Item Name</label> <input type="text" name="itemToMove"    value=""/>  <br/>
                    </td>
                 </tr>
                 <tr>
                    <td>
                      <label for="14">Move To</label> 
                      <select id="location" name="location">
                      <option>Athlone</option>
                      <option>Galway</option>
                      <option>Dublin</option>
                      </select>
                    </td>
                 </tr>
                 <tr>
                    <td>
                      <label for="15">Quantity to Move</label> <input type="text" name="quantity"    value=""/>  <br/>
                      <input type="submit" name="moveStock"  value="Move Stock"/> &nbsp;&nbsp;
                    </td>
                 </tr>
            </table>
        </form>
        
   		<p style="background-color:yellow">
           Status message: <b>${requestScope.statusMessage}</b>
        </p>

    </body>
</html>
