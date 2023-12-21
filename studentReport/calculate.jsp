<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<style>
		body
		{
		background-color:white;
		}
      .container {
        margin-top: 20px;
        display: flex;
        align-items: center;
 
        justify-content: center;
        flex-direction: column;
      }
      h1 {
        color: blue ;
      }
      table ,tr,td{
      	border: 1px solid black;
      	border-collapse= collapse;
      }
      tr:hover {background-color: #D6EEEE;}
      td:nth-child(even), th:nth-child(even) {
  		background-color: #D6EEEE;
	  }
   </style>
<body>
    <div class="container">
        <h1>Student Result</h1>
        <%
            String name = request.getParameter("name");
            double subject1 = Double.parseDouble(request.getParameter("physics"));
            double subject2 = Double.parseDouble(request.getParameter("subject2"));
            double subject3 = Double.parseDouble(request.getParameter("subject3"));
            double subject4 = Double.parseDouble(request.getParameter("subject4"));
            double subject5 = Double.parseDouble(request.getParameter("subject5"));
            double subject6 = Double.parseDouble(request.getParameter("subject6"));
            double subject7 = Double.parseDouble(request.getParameter("subject7"));
            double subject8 = Double.parseDouble(request.getParameter("subject8"));
            
            double average = (subject1 + subject2 + subject3+subject4+subject5 + subject6 + subject7+subject8) / 8;
            String grade = "";

            if (average >= 90) {
                grade = "A+";
                
            } else if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
        %>
        <table class ="table table-bordered" id ="t01"  style ="width:100%">
        <tr><td><p><b>Name: </b><%= name %></p></td></tr>
        <tr><td><p><b>Physics: </b><%= subject1 %></p></td></tr>
        <tr><td><p><b>Chemistry: </b><%= subject2 %></p></td></tr>
        <tr><td><p><b>Mathematics: </b><%= subject3 %></p></td></tr>
        <tr><td><p><b>English: </b><%= subject4 %></p></td></tr>
        <tr><td><p><b>Hindi: </b><%= subject5 %></p></td></tr>
        <tr><td><p><b>Biology: </b><%= subject6 %></p></td></tr>
        <tr><td><p><b>Computers: </b><%= subject7 %></p></td></tr>
        <tr><td><p><b>Physical Education: </b><%= subject8 %></p></td></tr>
        </table>
        <p>Average: <%= average %></p>
        <p>Grade: <%= grade %></p>
        <p><a href="index.html">Go Back</a></p>
    </div>
</body>
</html>

