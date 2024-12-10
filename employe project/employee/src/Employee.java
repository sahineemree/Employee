public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int year;

    Employee (String name,double salary,int workHours,int hireYear,int year) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.year=year;
    }
    double tax(int year){

        if (salary > 1000){
            double vergi = this.salary * ((double) 3 / 100);
            return vergi ;
        }
        else {
            return salary;
        }
    }
    double bonus(int workHours) {
        int a = workHours-40;
        double bonus = 0;
        if (a>0){
           return bonus = (a*30);
        }
        else {
            return bonus;
        }
    }
    double raiseSalary(int hireYear){
        int year = 2021;
        if (year - this.hireYear > 0){

            if (year - this.hireYear <= 9){
                return  salary*((double) 5 /100);
            }
            else if (year - this.hireYear > 9 && year - this.hireYear <= 19){
                return  salary*((double) 10 /100);
            }
            else {
                return  salary*((double) 15 /100);
            }

        }
        else {
            System.out.println("Geçersiz yıl girdiniz!");
        }
        return 0;
    }
    void toStringg(){
        System.out.println("Adı = " + this.name);
        System.out.println("Maaşı = " + this.salary);
        System.out.println("Çalışma Saati = " + this.workHours);
        System.out.println("Başlangıç yılı = " + this.hireYear);
        System.out.println("Vergi = " + this.tax(this.year));
        System.out.println("Bonus = " + this.bonus(this.workHours));
        System.out.println("Maaş artışı = " + this.raiseSalary(this.hireYear));
        System.out.println("Toplam Maaş = " + (this.salary + this.bonus(this.workHours) - this.tax(this.year) + this.raiseSalary(this.hireYear)));

    }
}