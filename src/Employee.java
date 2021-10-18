public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double tempSalary;
    double increaseSalary;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.tempSalary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){
        if(this.tempSalary>=1000.0){
            this.tax=this.tempSalary*0.03;
            this.salary-=this.tax;
        }
    }

    void bonus(){
        if(this.workHours>40){
            this.bonus=(this.workHours-40)*30;
            this.salary+=this.bonus;
        }
    }
    void raiseSalary(){
        int workYears=2021-this.hireYear;
        if(workYears<10){
            this.increaseSalary=this.tempSalary*0.05;
            this.salary+=(this.increaseSalary);
        }else if(workYears<20){
            this.increaseSalary=this.tempSalary*0.1;
            this.salary+=(this.increaseSalary);
        }else {
            this.increaseSalary=this.tempSalary*0.15;
            this.salary+=(this.increaseSalary);
        }
    }
    void tooString(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.tempSalary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.tax);
        System.out.println("Bonus : "+this.bonus);
        System.out.println("Maaş artışı : "+this.increaseSalary);
        System.out.println("Vergi ve Bonuslar ile maaş : "+(this.salary-this.increaseSalary));
        System.out.println("Toplam Maaş : "+(this.salary));
    }

    void run(){
        tax();
        bonus();
        raiseSalary();
        tooString();
    }
}
