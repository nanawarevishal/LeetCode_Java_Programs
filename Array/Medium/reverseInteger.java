package Array.Medium;

public class reverseInteger {

    static int reverse(int x) {

        if(x<=Integer.MIN_VALUE){
            return 0;
        }

        int sum = 0;
        boolean flag = false;
        if(x<0){
            flag = true;
            Math.abs(x);
            x = 0-x;
        }

        int num = x;


        String str = "";

        while(x!=0){

            str +=(x%10);
            sum  = sum *10+(x%10);

            x/=10;

        }

        long p = 0;


        p = Long.parseLong(str);


        if(flag){

            p = 0-p;
            sum = 0-sum;
        }

        // System.out.println(p);

        if(p>=Integer.MAX_VALUE || p<=Integer.MIN_VALUE){

            return 0;
        }

        // System.out.println(sum);

        return sum;
    }
        
    public static void main(String[] args) {
        
        System.out.println(reverse(-1563847412));
    }
}
