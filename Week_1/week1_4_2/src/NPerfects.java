// Bài thực hành in ra các số hoàn hảo nhỏ hơn n với n được nhập từ bàn phím
//Kết quả in trên một dòng các số được cách nhau bởi một dấu cach

class NPerfects
{
    // Hàm kiểm tra số n có phải là số hoàn hảo hay không
    // nếu n là số hoàn hảo thì trả về true, ngược lại trả về false
    static boolean isPerfect(int n)
    {
        //begin edit
        boolean perfectNumber = false;
        double sumDivisors = 0.0d;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                sumDivisors += i;
            }
        }
        perfectNumber = n == sumDivisors;
        return perfectNumber;
        //end edit
    }
    // hàm in ra các số hoàn hảo nhỏ hơn n trên cùng dòng, ví dụ n = 100 kết quả in ra là:
    // 6 28

    static void printNPerfect(int n)
    {
        for (int i = 1; i < n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main (String args[])
    {
        System.out.println(isPerfect(8128));
        printNPerfect(40000);
    }
}