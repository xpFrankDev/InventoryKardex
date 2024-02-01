package Clases;

import java.time.LocalDate;

public class Employee {

    private String firstName;
    private String lastName;
    private int ssn;
    private boolean isMarried;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private StringBuffer sb = new StringBuffer();

    public Employee() {
    }

    public Employee(String firstName, String lastName, int ssn, boolean isMarried,
            LocalDate birthDate, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.isMarried = isMarried;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSSN() {
        return ssn;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(int ssn) {
        this.ssn = ssn;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        sb.setLength(0);
        sb.append("First name [");
        sb.append(firstName);
        sb.append("], Last name [");
        sb.append(lastName);
        sb.append("], SSN [");
        sb.append(ssn);
        sb.append("], Married [");
        sb.append(isMarried);
        sb.append("], Birthdate [");
        sb.append(birthDate);
        sb.append("], Hiredate [");
        sb.append(hireDate);
        sb.append("]");
        return sb.toString();
    }
}
