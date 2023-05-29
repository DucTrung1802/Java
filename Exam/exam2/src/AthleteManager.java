import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
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
        for (Athlete athlete : arrayAthlete) {
            System.out.println(athlete.toString());
        }
    }

    public static void printBMIs(ArrayList<Athlete> aths) {
        for (Athlete ath : aths) {
            double bmi = ath.getWeight() / (ath.getHeight() * ath.getHeight()) * 10000;
            bmi = (double) Math.round(bmi * 1000) / 1000;
            System.out.println(bmi + "\t");
        }
    }

    public static ArrayList<Athlete> findSport(ArrayList<Athlete> aths, String sport) {
        ArrayList<Athlete> temp_aths = new ArrayList<>();
        for (Athlete ath : aths) {
            if (Objects.equals(ath.getSport().toLowerCase(), sport.toLowerCase())) {
                temp_aths.add(ath);
            }
        }
        return temp_aths;
    }

    public static void main(String[] args) {
        ArrayList<Athlete> arrayAthlete = readFile("src/athletes.txt");
        printAthletes(arrayAthlete);
        printBMIs(arrayAthlete);
        printAthletes(findSport(arrayAthlete, "Bong Chuyen"));
    }
}
