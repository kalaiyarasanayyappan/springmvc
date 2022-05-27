package com.chainsys.miniproject.ui;
import com.chainsys.miniproject.common.InvalidInputDataException;
import com.chainsys.miniproject.common.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUi {
	public static void addNewEmployee() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            Employee newemp = new Employee();
            System.out.println("Enter Employee Id :");
            String id = sc.nextLine();
            try {
                Validator.checkStringForParseInt(id);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            int empId = Integer.parseInt(id);
            try {
                Validator.checkNumberForGreaterThanZero(empId);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            Employee emp = EmployeeDao.getEmployeeById(empId);
            if (emp == null) {
                System.out.println("Employee Doesn't Exist For Id " + empId);
                return;
            }
            newemp.setEmployee_id(empId);
            System.out.println("Enter First_Name :");
            String fName = sc.nextLine();
            try {
                Validator.checkCharLessThanTwenty(fName);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            try {
                Validator.checkDataOnlyString(fName);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setFirst_name(fName);
            System.out.println("Enter Last_Name :");
            String lName = sc.nextLine();
            try {
                Validator.checkCharLessThanTwenty(lName);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            try {
                Validator.checkDataOnlyString(lName);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setLast_name(lName);
            System.out.println("Enter Email :");
            String eMail = sc.nextLine();
            try {
                Validator.checkMailContainsAtsymbol(eMail);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setEmail(eMail);
            
            System.out.println("Enter Phone Number :");
            String num =sc.nextLine();
            try {
                Validator.checkStringForParseInt(num);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            try {
                Validator.checkPhoneNumberTenDigits(num);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setPhone_number(num);
            System.out.println("Enter Date :");
            String dateFormat = "dd/MM/yyyy";
             
               try {
                   newemp.setHire_date(new SimpleDateFormat(dateFormat).parse(sc.nextLine()));
               } catch (ParseException e) {
                   e.printStackTrace();
               }
           
              
            System.out.println("Enter Job_id :");
            String jobId = sc.nextLine();
            try {
                Validator.checkCharLessThanTwenty(jobId);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setJob_id(jobId);
            System.out.println("Enter Salary :");
            float salary = sc.nextFloat();
            try {
                Validator.checkSalaryLessThanTenDigit(salary);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            try {
                
                Validator.checkNumberForGreaterThanZero((int) salary);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            try {
                Validator.checkSlaryOnlyNumbers((int) salary);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setSalary(salary);
            int result = EmployeeDao.insertEmployee(newemp);
            System.out.println(result);
        } finally {
            sc.close();
        }
	}
	public static void updateEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId);
				return;
			}
			newemp.setEmployee_id(empId);
			System.out.println("Enter First_Name to Modify:");
			String fName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkDataOnlyString(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);
			System.out.println("Enter Last_Name to Modify:");
			String lName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkDataOnlyString(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setLast_name(lName);
			System.out.println("Enter Email to Modify:");
			String eMail = sc.nextLine();
			try {
				Validator.checkMailContainsAtsymbol(eMail);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmail(eMail);
			System.out.println("Enter Phone Number :");
            String num =sc.nextLine();
            try {
                Validator.checkStringForParseInt(num);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            try {
                Validator.checkPhoneNumberTenDigits(num);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setPhone_number(num);

			System.out.println("Enter Date :");
            String dateFormat = "dd/MM/yyyy";
             
               try {
                   newemp.setHire_date(new SimpleDateFormat(dateFormat).parse(sc.nextLine()));
               } catch (ParseException e) {
                   e.printStackTrace();
               }

			System.out.println("Enter Job_id to Modify:");
			String jobId = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setJob_id(jobId);
			System.out.println("Enter Salary to Modify:");
			float salary = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkNumberForGreaterThanZero((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkSlaryOnlyNumbers((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salary);
			int result = EmployeeDao.updateEmployee(newemp);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateEmployeeFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmployee_id(empId);
			System.out.println("Enter Update Name :");
			String fName = sc.nextLine();
			try {
			com.chainsys.miniproject.common.Validator.checkCharLessThanTwenty(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkDataOnlyString(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);
			int result = EmployeeDao.updateEmployeeFirstName(empId, fName);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateEmployeeSalary() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmployee_id(empId);
			System.out.println("Enter Update salary :");
			float salary = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkNumberForGreaterThanZero((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salary);
			int result = EmployeeDao.updateEmployeeSalary(empId, salary);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void deleteEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmployee_id(empId);
			int result = EmployeeDao.deleteEmployee(empId);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void getEmployeeById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {//
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmployee_id(empId);
			Employee result = EmployeeDao.getEmployeeById(empId);
			System.out.println(result.getEmployee_id() + " " + result.getFirst_name() + " " + result.getLast_name() + " "
					+ result.getEmail() + " " + result.getPhone_number()+" "+result.getHire_date() + " " + result.getJob_id() + " "
					+ result.getSalary());
		} finally {
			sc.close();
		}
	}

	public static void getAllEmployeesDetails() {
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			System.out.println(emp.getEmployee_id() + " " + emp.getFirst_name() + " " + emp.getLast_name() + " "
					+ emp.getEmail() + " " + emp.getPhone_number()+" "+emp.getHire_date() + " " + emp.getJob_id() + " " + emp.getSalary());
		}
	}

}
