package Employee;

import javax.jws.WebService;
import java.util.Scanner;

public class NVFullTime extends NhanVien {
    public float bonus;
    public float fines;
    public float fixedSalary;

//    public NVFullTime(int id, String name, int age, String sdt, double salary,float bonus, float fines, float fixedSalary) {
//        super(id, name, age, sdt, salary);
//        Bonus = bonus;
//        Fines = fines;
//        FixedSalary = fixedSalary;
//    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        bonus = bonus;
    }

    public float getFines() {
        return fines;
    }

    public void setFines(float fines) {
        fines = fines;
    }

    public float getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(float fixedSalary) {
        fixedSalary = fixedSalary;
    }

    @Override
    public void addInfo() {
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bonus: ");
        bonus = Float.parseFloat(sc.nextLine());
        System.out.println("Enter fines: ");
        fines = Float.parseFloat(sc.nextLine());
        System.out.println("Enter fixedSalary: ");
        fixedSalary = Float.parseFloat(sc.nextLine());
    }

    @Override
    public double ggetSalary() {
        double salary = fixedSalary + (bonus - fines);
        return salary;
    }

    @Override
    public String toString() {
        return "NVFullTime{" +
                " Id=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Sdt='" + sdt + '\'' +
                ", Bonus=" + bonus +
                ", Fines=" + fines +
                ", FixedSalary=" + fixedSalary +
                ", Salary=" + ggetSalary() +
                '}';
    }
}