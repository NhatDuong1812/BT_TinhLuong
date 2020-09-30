package Program;

import Methods.Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Methods mt = new Methods();
        Scanner sc = new Scanner(System.in);
        int choose ;
        do {
            System.out.println("1. add.");
            System.out.println("2. show.");
            System.out.println("3. delete.");
            System.out.println("4. Total salary part time.");
            System.out.println("5. Save to file.");
            System.out.println("6. Read from file.");
            System.out.println("7. Exit.");
            System.out.print("--Choice: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    mt.add();
                    break;
                case 2:
                    mt.show();
                    break;
                case 3:
                    System.out.println("Enter Name of employee want delete. ");
                    String nameDelete = sc.nextLine();
                    mt.delete(nameDelete);
                    System.out.println("Delete complete.");
                    break;
                case 4:
                    double x = mt.TotalSalaryForPartTime();
                    System.out.println("Total salary for part time employee: " + x);
                    break;
                case 5:
                    mt.writeFile();
                    System.out.println("Add to file complete!!!");
                    break;
                case  6:
                    mt.readFile();
                    break;
            }
        } while (choose != 7);
        System.out.println("See you again !!");

    }
}

