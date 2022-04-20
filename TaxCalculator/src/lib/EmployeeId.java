package lib;

public class EmployeeId extends Employee {
    String employeeId;
    String firstName; 
    String lastName; 
    String idNumber; 
    String address;
    public EmployeeId (String employeeId, String firstName, String lastName, String idNumber, String address){
        this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
    }
}