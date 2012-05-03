<jsp:useBean id="Student" scope="session" class="Student.StudentDetails" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h2>You successfully add the marks </h2>
       <table border="0">
	<tr>
	<td width="100">Student Name:</td>
        <td><jsp:getProperty name="Student" property="studentName" /></td>
        </tr> 
        
        <tr>
        <td>Grade:</td>
        <td><jsp:getProperty name="Student" property="grade" /></td>
        </tr>
        
        <tr>
        <td>Subject:</td>
        <td><jsp:getProperty name="Student" property="subject" /></td>
        </tr>
        
        <tr>
        <td>Marks:</td>
        <td><jsp:getProperty name="Student" property="marks" /></td>
	</tr> 
    </table>
    </center>  
        
    </body>
</html>