

/*

50. Pow(x, n)
        Medium
        8.9K
        8.7K
        Companies
        Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

        Example 1:
        Input: x = 2.00000, n = 10
        Output: 1024.00000.

        Example 2:
        Input: x = 2.10000, n = 3
        Output: 9.26100.

        Example 3:
        Input: x = 2.00000, n = -2
        Output: 0.25000
        Explanation: 2-2 = 1/22 = 1/4 = 0.25


 */

package Array.Medium;
public class power {

    static double myPow(double x, int n) {
        
        // System.out.println(Integer.MIN_VALUE);
        boolean flag = false;
        // if(n<=Integer.MIN_VALUE){
        //     return 0.00;
        // } 
        if(n<0){
            flag = true;
            n = 0-n;
        }

        System.out.println(n);

        double num =1;

        for(int i=0;i<n;i++){
            num *=x;
        }

        if(flag){
            double m = 1/num;
            return m;
        }


        return num;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2147483648));
    }
}
