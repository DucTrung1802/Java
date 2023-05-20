import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Employee{
    private double salaryCoefficient;

    public Manager() {

    }

    public Manager(String name, String hometown, int basicSalary, int days, double salaryCoefficient) {
        super(name, hometown, basicSalary, days);
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public double computeSalary() {
        return super.getBasicSalary() * super.getDays() * this.salaryCoefficient;
    }

    @Override
    public String toString() {
        return "Manager\t\t[name=" + super.getName() + ", hometown=" + super.getHometown() + ", basicSalary=" + super.getBasicSalary() + ", days=" + super.getDays() + ", salaryCoefficient=" + this.salaryCoefficient + ", computeSalary()=" + computeSalary() + "]";
    }

}
