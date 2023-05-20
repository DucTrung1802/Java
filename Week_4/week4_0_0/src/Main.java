import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static ArrayList<Employee> readFile(String fileName) {
        Scanner scan = null;
        ArrayList<Employee> ems = new ArrayList<>();

        try {
            scan = new Scanner(new File(fileName));
            while (scan.hasNext()) {
                // đọc ra loại nhân viên
                int c = Integer.parseInt(scan.nextLine());
                String name = scan.nextLine();
                String hometown = scan.nextLine();
                int basicSalary = Integer.parseInt(scan.nextLine());
                int days = Integer.parseInt(scan.nextLine());
                if (c == 0)
                    ems.add(new Employee(name, hometown, basicSalary, days));
                else if (c == 1) {
                    // đọc thêm số dự án
                    int nProjects = Integer.parseInt(scan.nextLine());
                    ems.add(new Developer(name, hometown, basicSalary, days, nProjects));
                } else if (c == 2) {
                    double salaryCoefficient = Double.parseDouble(scan.nextLine());
                    ems.add(new Manager(name, hometown, basicSalary, days, salaryCoefficient));
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ems;
    }

    public static void printEmployees(ArrayList<Employee> ems) {
        for (Employee e : ems)
            System.out.println(e.toString());
    }

    public static ArrayList<Employee> EmployeesWithHowetown(ArrayList<Employee> ems, String howetown) {
        ArrayList<Employee> temp_ems = new ArrayList<>();
        for (Employee em : ems) {
            if (Objects.equals(em.getHometown().toLowerCase(), howetown.toLowerCase())) {
                temp_ems.add(em);
            }
        }
        return temp_ems;
    }

    public static ArrayList<Employee> EmployeesWithHighestSalary(ArrayList<Employee> ems) {
        ArrayList<Employee> temp_ems = new ArrayList<>();
        double max_salary = 0.0d;
        for (Employee em : ems) {
            if (em.computeSalary() > max_salary) {
                max_salary = em.computeSalary();
            }
        }
        for (Employee em: ems) {
            if (em.computeSalary() == max_salary) {
                temp_ems.add(em);
            }
        }
        return temp_ems;
    }

    public static ArrayList<Employee> EmployeesWithLowestSalary(ArrayList<Employee> ems) {
        ArrayList<Employee> temp_ems = new ArrayList<>();
        double min_salary = ems.get(0).computeSalary();
        for (Employee em : ems) {
            if (em.computeSalary() < min_salary) {
                min_salary = em.computeSalary();
            }
        }
        for (Employee em: ems) {
            if (em.computeSalary() == min_salary) {
                temp_ems.add(em);
            }
        }
        return temp_ems;
    }

    public static void sortEmployees()

    // In ra các nhân viên có quê ở "nam định"
    // Tìm các nhân viên có lương cao nhất?
    // Tìm nhân viên có lương thấp nhất và in ra nhân viên đó thuộc loại nào
    // Sắp xếp lại nhân viên theo lương/ quê quán/ số ngày làm việc

    public static void main(String[] args) {
        // Tệp tin gồm
        // Loại nhân viên: 0 - Employee, 1 - Developer, 2 - Manager
        // Thông tin của các nhân viên, mỗi thông tin trên 1 dòng
        ArrayList<Employee> ems = readFile("src/employees.txt");
        printEmployees(ems);
        System.out.println("\nHowetown: Ha Noi");
        printEmployees(EmployeesWithHowetown(ems, "Ha Noi"));
        System.out.println("\nHighest salary");
        printEmployees(EmployeesWithHighestSalary(ems));
        System.out.println("\nLowest salary");
        printEmployees(EmployeesWithLowestSalary(ems));
    }
}
