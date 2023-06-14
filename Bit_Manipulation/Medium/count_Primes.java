
/*

204. Count Primes
        Medium
        6.9K
        1.3K
        Companies
        Given an integer n, return the number of prime numbers that are strictly less than n.

        
        Example 1:
        Input: n = 10
        Output: 4
        Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.


        Example 2:
        Input: n = 0
        Output: 0

        Example 3:
        Input: n = 1
        Output: 0

 */


package Bit_Manipulation.Medium;

public class count_Primes {

    static int countPrimes(int n) {
        int primeCount=0;
        if(n<=2){
            return 0;
        }
        
        else{
            for(int i=2;i<n;i++){
                for(int j=2;j<=(int)Math.sqrt(i);j++){
                    if(i%j==0){
                        break;
                    }
                    System.out.println(i);
                    primeCount++;
                }
            }
        }


        return primeCount;
    }
    public static void main(String[] args) {
        int n = 10;

        System.out.println(countPrimes(n));

    }
}
