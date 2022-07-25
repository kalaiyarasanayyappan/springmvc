<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Doctor Appointments</title>
</head>
<body>
    <div id="root">
        <div id="docform">
            <form:form action="" method="post"
                modelAttribute="getdoctor">
                <div>
                    <label for="doctor_Id">Doctor Id</label>
                    <div>
                        <form:input path="doctor_Id" readonly="true"/>
                    </div>
                </div>
                <div>
                    <label for="name">Doctor Name</label>
                    <div>
                        <form:input path="name" readonly="true"/>
                    </div>
                </div>
                <div>
                    <label for="dob">DOB</label>
                    <div>
                        <form:input path="dob" readonly="true"/>
                    </div>
                </div>
                <div>
                    <label for="speciality">Speciality</label>
                    <div>
                        <form:input path="speciality" readonly="true"/>
                    </div>
                </div>
                <div>
                    <label for="city">City</label>
                    <div>
                        <form:input path="city" readonly="true"/>
                    </div>
                </div>
                <div>
                    <label for="phone_number">Phone Number</label>
                    <div>
                        <form:input path="phone_number" readonly="true"/>
                    </div>
                </div>
                <div>
                    <label for="std_fees">Fees</label>
                    <div>
                        <form:input path="std_fees" readonly="true"/>
                    </div>
                </div>
        </form:form>
    </div>
    <div id="applist">
    <table>
        <thead>
            <tr>
            <th>Appoint Id</th>
            <th>Appoint Date</th>
            <th>Doctor Id</th>
            <th>Patient Name</th>
            <th>Fees Collected</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="appointment" items="${applist}">
            <tr>
            <td>${appointment.id}</td>
            <td>${appointment.appoint_date}</td>
            <td>${appointment.doctor_id}</td>
            <td>${appointment.patient_name}</td>
            <td>${appointment.fees_collected}</td>
            </tr>
            </c:forEach>
        </tbody>
        </table>
        </div>
        </div>
</body>
</html>