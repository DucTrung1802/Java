import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
            while (scan.hasNext()) {
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

    public static void print(ArrayList<Athlete> aths) {
        for (Athlete a : aths) {
            System.out.println(a.toString());
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

    public static ArrayList<Athlete> findAthlete(ArrayList<Athlete> aths) {
        ArrayList<Athlete> temp_ath = new ArrayList<>();
        double max_height = 0.0d;
        for (Athlete ath : aths) {
            if (ath.getHeight() > max_height) {
                max_height = ath.getHeight();
            }
        }
        for (Athlete ath : aths) {
            if (ath.getHeight() == max_height) {
                temp_ath.add(ath);
            }
        }
        return temp_ath;
    }

    public static void sort(ArrayList<Athlete> aths) {
        for (int i = 0; i < aths.size() - 1; i++) {
            for (int j = i + 1; j < aths.size(); j++) {
                if (aths.get(i).getName().toLowerCase().compareTo(aths.get(j).getName().toLowerCase()) > 0) {
                    Collections.swap(aths, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Athlete> arrayAthlete = readFile("src/athletes.txt");
        print(arrayAthlete);
        printBMIs(arrayAthlete);
        print(findSport(arrayAthlete, "Bong Chuyen"));
        print(findAthlete(arrayAthlete));
        sort(arrayAthlete);
        print(arrayAthlete);
    }
}
