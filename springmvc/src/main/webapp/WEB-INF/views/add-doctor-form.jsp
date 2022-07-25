<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>
</head>
<body>
  <div id="root">
        <div id="form">
            <form:form action="adddoctor" method="post"
                modelAttribute="adddoc">
                <div>
                    <label for="doctor_id">Doctor Id</label>
                    <div>
                        <form:input path="doctor_id" />
                    </div>
                </div>
                <div>
                    <label for="name">Doctor Name</label>
                    <div>
                        <form:input path="name" />
                    </div>
                </div>
                <div>
                    <label for="dob">DOB</label>
                    <div>
                        <form:input path="dob" />
                    </div>
                </div>
                <div>
                    <label for="speciality">Speciality</label>
                    <div>
                        <form:input path="speciality" />
                    </div>
                </div>
                <div>
                    <label for="city">City</label>
                    <div>
                        <form:input path="city" />
                    </div>
                </div>
                <div>
                    <label for="phone_number">Phone Number</label>
                    <div>
                        <form:input path="phone_number" />
                    </div>
                </div>
                <div>
                    <label for="std_fees">Fees</label>
                    <div>
                        <form:input path="std_fees" />
                    </div>
                </div>
        <div>
            <form:button>Add Doctor</form:button>
        </div>
        </form:form>
    </div>
    </div>
</body>
</html>