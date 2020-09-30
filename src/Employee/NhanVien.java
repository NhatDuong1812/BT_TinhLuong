package Employee;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NhanVien {
    public int id;
    public String name;
    public int age;
    public String sdt;
    public String email;
    public double salary;
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PHONE_REGEX = "^(0|84)?[0-9]{9}$";

    public NhanVien(){}

    public NhanVien(int id, String name, int age, String sdt, String email, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sdt = sdt;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public double getSalary() {
//        return salary;
//        }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public static boolean validEmail(String regex) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validPhone(String regex) {
        pattern = Pattern.compile(PHONE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        do {
            System.out.print("Phone number: ");
            sdt = sc.nextLine();
            if (!validPhone(sdt)) {
                System.out.println("!!!!Phone number unavailable. please re-enter.");
            }
        } while (!validPhone(sdt));
        do {
            System.out.print("Email: ");
            email = sc.nextLine();
            if (!validEmail(email)) {
                System.out.println("!!!!Email unavailable. please re-enter. ");
            }
        } while (!validEmail(email));
//        System.out.println("Enter phone number: ");
//        sdt = sc.nextLine();
//        System.out.println("Enter email: ");
//        email = sc.nextLine();
    }
}
