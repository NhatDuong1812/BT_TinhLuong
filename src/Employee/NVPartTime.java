package Employee;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class NVPartTime extends NhanVien {
    public int hour;

//    public NVPartTime(){}
//
//    public NVPartTime(int id, String name, int age, String sdt, double salary,int hour){
//        super(id, name, age, sdt, salary);
//        this.hour = hour;
//
//    }


    @Override
    public void addInfo() {
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour: ");
        hour = Integer.parseInt(sc.nextLine());

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double ggetSalary() {
        double salary = 100000 * hour;
        return salary;
    }

    @Override
    public String toString() {
        return "NVPartTime{" +
                " Id=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Sdt='" + sdt + '\'' +
                ", Hour= " + hour +
                ", Salary= " + ggetSalary() +
                '}';
    }
}
