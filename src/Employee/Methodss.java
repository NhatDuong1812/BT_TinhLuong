package Employee;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methodss {
    static List<NhanVien> nhanViens = new ArrayList<>();

    public void show() {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public void add() {
        do {
            NVFullTime nvFT = new NVFullTime();
            NVPartTime nvPT = new NVPartTime();
            Scanner sc = new Scanner(System.in);
            System.out.println("+ 1. Add employee full time: ");
            System.out.println("+ 2. Add employee part time: ");
            System.out.println("--Choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    nvFT.addInfo();
                    nhanViens.add(nvFT);
                    break;
                case 2:
                    nvPT.addInfo();
                    nhanViens.add(nvPT);
                    break;
            }
            break;
        } while (true);
    }

    public double TotalSalaryForPartTime()
    {
        double total = 0;
        for (NhanVien nhanVien : nhanViens)
        {
            if (nhanVien instanceof NVPartTime)
            {
                NVPartTime nvPT = (NVPartTime) nhanVien;
                total += nvPT.ggetSalary();
            }
        }
        return total;
    }


}
