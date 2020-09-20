package Employee;

import java.util.Scanner;

public class NhanVien {
    public int id;
    public String name;
    public int age;
    public String sdt;
    public String email;
    public double salary;

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

    public double getSalary() {
        return salary;
        }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double ggetSalary() {
        return 0.0;
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter phone number: ");
        sdt = sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
    }
}
