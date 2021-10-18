import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Double salary;
        int workHours;
        int hireYear;

        Scanner input=new Scanner(System.in);

        System.out.print("Çalışanın adı : ");
        name=input.nextLine();
        System.out.print("Çalışanın maaşı : ");
        salary=input.nextDouble();
        System.out.print("Çalışanın çalışma saati : ");
        workHours=input.nextInt();
        System.out.print("Çalışanın başlangıç yılı : ");
        hireYear=input.nextInt();

        Employee emp=new Employee(name,salary,workHours,hireYear);
        emp.run();

    }
}
