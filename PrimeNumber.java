

public class PrimeNumber {

     public static boolean isPrime(int n) {
      
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
     public static void RangeOfPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if(i>end){
                System.out.println("Provide Valid Input");
                break;
            }
            if (isPrime(i)) {
                System.out.println(i);
            }else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        RangeOfPrimeNumbers(8, 5);
    }
    
}
     
