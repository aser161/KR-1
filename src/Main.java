public class Main {
    static Employee[] bookOfEmployees = new Employee[10];
    public static void main(String[] args) {

        bookOfEmployees[0] = new Employee("Петров Петр Петрович ", 1, 30_000);

        bookOfEmployees[1] = new Employee("Васильев Василий Васильевич", 2, 31_000);

        bookOfEmployees[2] = new Employee("Васильев Иван Васильевич", 3, 32_000);

        bookOfEmployees[3] = new Employee("Васильев Семен Васильевич", 4, 33_000);

        Employee.showListEmployees();

        System.out.println(Employee.countSumSalaries ());

        System.out.println(Employee.findMinSalary());

        System.out.println(Employee.findMaxSalary());

        System.out.println(Employee.countMeanSalary());

        Employee.showAllEmployees();


    }
}