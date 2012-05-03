<%-- 
    Document   : index
    Created on : May 2, 2012, 2:01:45 PM
    Author     : Vanaja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <center>
        <h1>Add Student Marks</h1>
        <form action="Controller" method="Post" > 
            <table border="0">
                <tbody>
                    <tr>
                        <td width="100">Student Name:</td>
                        <td><select name="studentName">
                                <option>Lukshica</option>
                                <option>Mayooran</option>
                                <option>Vijay</option>
                                <option>Nilash</option>
                                <option>Thenu</option>
                                <option>Ramanan</option>
                                <option>Tharo</option>
                                <option>Keerthika</option>
                                <option>Meera</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td> Grade:</td>
                        <td><select name="grade">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                                <option>13</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Subject:</td>
                        <td><input type="text" name="subject"/></td>
                    </tr>
                    <tr>
                        <td> Marks:</td>
                        <td><input type="text" name="marks"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Add" name="Add" /></td>
                        <td><input type="reset" value="Reset" name="Reset" /></td>
                    </tr>
                </tbody>
            </table> 
            </center>
        </form>
    </body>
</html>
