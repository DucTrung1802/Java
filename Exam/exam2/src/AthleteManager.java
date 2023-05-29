import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AthleteManager {

    public static ArrayList<Athlete> readFile(String filename) {
        Scanner scan = null;
        ArrayList<Athlete> arrayAthlete = null;
        try {
            scan = new Scanner(new File(filename));
            arrayAthlete = new ArrayList<>();

            int numAthlete = Integer.parseInt(scan.nextLine());
            while(scan.hasNext()) {
                String name = scan.nextLine();
                int year = Integer.parseInt(scan.nextLine());
                String sport = scan.nextLine();
                double weight = Double.parseDouble(scan.nextLine());
                double height = Double.parseDouble(scan.nextLine());
                Athlete a = new Athlete(name, year, sport, weight, height);
                arrayAthlete.add(a);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return arrayAthlete;
    }

    public static void printAthletes(ArrayList<Athlete> arrayAthlete) {
        for (int i = 0; i < arrayAthlete.size(); i++) {
            System.out.println(arrayAthlete.get(i).toString());
        }
    }

    public static void printBMIs(ArrayList<Athlete> aths) {
        for (int i = 0; i < aths.size(); i++) {
            double bmi = aths.get(i).getWeight() / (aths.get(i).getHeight() * aths.get(i).getHeight()) * 10000;
            bmi = (double) Math.round(bmi * 1000) / 1000;
            System.out.println(bmi + "\t");
        }
    }

    public static void main(String[] args) {
        ArrayList<Athlete> arrayAthlete = readFile("src/athletes.txt");
        printAthletes(arrayAthlete);
        printBMIs(arrayAthlete);
    }
}
