package Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methodss mt = new Methodss();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. add");
            System.out.println("2. show");
            System.out.println("3. Total salary part time");
            System.out.println("--Choice: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    mt.add();
                    break;
                case 2:
                    mt.show();
                    break;
                case 3:
                    double x = mt.TotalSalaryForPartTime();
                    System.out.println("Total salary for part time employee: " + x);
                    break;
            }
        }while (true);

    }
}

