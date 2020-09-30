package Methods;
import Employee.NVFullTime;
import Employee.NVPartTime;
import Employee.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
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
                total += nvPT.getSalary();
            }
        }
        return total;
    }

    public void delete(String nameDelete){
        for (NhanVien nhanvien: nhanViens
             ) {
            if (nameDelete.equals(nhanvien.getName()) && nhanvien instanceof  NVFullTime || nhanvien instanceof NVPartTime){
                nhanViens.remove(nhanvien);
                break;
            }
        }
    }

    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter("Text");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(nhanViens.toString());
        bufferedWriter.close();
    }

    public void readFile() throws IOException{
        FileReader frr = new FileReader("Text");
        BufferedReader br = new BufferedReader(frr);
        String text;
        while ((text = br.readLine()) != null){
            System.out.println(text);
        }
        br.close();
    }

}
