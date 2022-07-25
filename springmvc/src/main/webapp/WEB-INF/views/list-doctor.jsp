<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
</head>
<body>
    <div id="table root">
    <table>
        <thead>
            <tr>
            <th>Doctor Id</th>
            <th>Name</th>
            <th>DOB</th>
            <th>Speciality</th>
            <th>City</th>
            <th>Phone Number</th>
            <th>Fees</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="doctor" items="${alldoctors}">
            <tr>
            <td>${doctor.doctor_Id}</td>
            <td>${doctor.name}</td>
            <td>${doctor.dob}</td>
            <td>${doctor.speciality}</td>
            <td>${doctor.city}</td>
            <td>${doctor.phone_number}</td>
            <td>${doctor.std_fees}</td>
            </tr>
            </c:forEach>
        </tbody>
        </table>
        </div>
</body>
</html>

