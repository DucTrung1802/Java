// Hoàn thiện hàm kiểm tra số nguyên tố isPrime
// Sinh viên có thể viết thêm các hàm khác nếu cần, tuy nhiên cần giữ nguyên khuôn mẫu hàm isPrime


public class NumberProps{

    //Sinh viên hoàn thiện hàm isPrime, giữ nguyên nguyên mẫu hàm
    public static boolean isPrime(int k){
        boolean prime = true;
        if (k <= 0) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(k); i++) {
            if (k % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(31));
    }


}