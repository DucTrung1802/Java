import java.util.Scanner;
//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong
class PerfectNumber
{
    public static boolean isPerfect(int n)
    {
        // begin edit
        if (n <= 0) {
            return false;
        }

        double sumDivisors = 0.0d;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                sumDivisors += i;
            }
        }

        return n == sumDivisors;
        //end edit

    }
    public static void main(String []args)
    {
        System.out.println("28 is perfect number ? " + isPerfect(28));
    }

}