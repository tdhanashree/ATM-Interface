import java.util.*;

public class Person {
    protected String firstname, middlename, lastname, address, pan_cardno, email_id;
    protected int dob, age, date, month, year;
    protected String aadharno, mobileno;
    protected String userid,password;
    private Long accno;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("***PERSONS BANK DETAILS***");
        System.out.println("Enter the Name");
        System.out.println("Enter the First Name");
        firstname = sc.next();
        System.out.println("Enter the Middle Name");
        middlename = sc.next();
        System.out.println("Enter the Last Name");
        lastname = sc.next();
        System.out.println("Enter the Address");
        address = sc.next();
        do {
            System.out.println("Enter the Age");
            age = sc.nextInt();
        } while (age < 20 || age > 100);
        do {
            System.out.println("Enter the Date of Birth");
            System.out.println("Date");
            date = sc.nextInt();
            System.out.println("Month");
            month = sc.nextInt();
            System.out.println("Year");
            year = sc.nextInt();
        } while (date > 31 || date < 0 || month > 12 || month < 0 || year < 1900 || year > 2022);
        do {
            System.out.println("Enter the Mobile no.");
            mobileno = sc.next();
        } while (mobileno.length() != 10);
        do {
            System.out.println("Enter the pan_card no.");
            pan_cardno = sc.next();
        } while (pan_cardno.length() != 12);
        do {
            System.out.println("Enter the Aadhar no.");
            aadharno = sc.next();
        } while (aadharno.length() != 12);

        System.out.println("Enter the email_id");
        email_id = sc.next();
        
        System.out.println("Enter Your UserID:");
        userid=sc.next();

        System.out.println("Enter Your Password:");
        password=sc.next();

        System.out.println("Enter Your Account Number:");
        accno=sc.nextLong();
    }

    public void Display() {
        System.out.println("**YOUR INFORMATION IS** ");
        System.out.println(firstname + " " + middlename + " " + lastname);
        System.out.println("Date of Birth:");
        System.out.println(date + "/" + month + "/" + year);
        System.out.println("Address:" + address);
        System.out.println("Age is:" + age);
        System.out.println("Mobile Number:" + mobileno);
        System.out.println("Pan_card No. :" + pan_cardno);
        System.out.println("Person Email_ID:" + email_id);
        System.out.println("Adhaar NO.:" + aadharno);
        System.out.println("UserID:" + userid);
        System.out.println("Password:" + password);
        System.out.println("AccNO:" + accno);
    }

}
