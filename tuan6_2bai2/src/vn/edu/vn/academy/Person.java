package vn.edu.vn.academy;

import java.util.Date;

public class Person {
    protected String fullname;
    private Date dateOfBirth;

    public Person(String fullname, Date dateOfBirth) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
    }

    protected void showInfo() {
        System.out.println("Fullname: " + fullname );
    }
}