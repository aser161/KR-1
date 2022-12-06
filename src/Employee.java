public class Employee {
     private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        counter++;
        this.id = counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fullName + " Отдел: " + department + " Зарплата: " + salary + " id: " + id;
    }
    public static void showListEmployees(){
        for (int i = 0; i < counter; i++) {
           System.out.println(Main.bookOfEmployees[i].toString());
        }
    }

    public static void showAllEmployees(){
        for (int i = 0; i < counter; i++) {
            System.out.println(Main.bookOfEmployees[i].getFullName());
        }
    }

    public static int countSumSalaries(){
        int total = 0;
        for (int i = 0; i < counter; i++) {
        total += Main.bookOfEmployees[i].getSalary();
        }
        return total;
    }
    public static double countMeanSalary(){
        return countSumSalaries()/counter;
    }

    public static int findMinSalary(){
        int minSalary = 1000000;
        for (int i = 0; i < counter; i++) {
             if (minSalary > Main.bookOfEmployees[i].getSalary()){
                 minSalary = Main.bookOfEmployees[i].getSalary();
             }
        }
        return minSalary;
    }

    public static int findMaxSalary(){
        int maxSalary = 0;
        for (int i = 0; i < counter; i++) {
            if (maxSalary < Main.bookOfEmployees[i].getSalary()){
                maxSalary = Main.bookOfEmployees[i].getSalary();
            }
        }
        return maxSalary;
    }
}
