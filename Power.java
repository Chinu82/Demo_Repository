import java.util.Scanner;

class Power{
    static int sumofdigit(int num)
    {
        int s=0,r;
        while (num > 0) {
            r = num %10;
            s = s+r;
            num/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Power of 9 or, Multiple of 9 with sum of digit :");
        //Object creation 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter number which will be multiplied with 9 :");
        int sn = sc.nextInt();
        int mul = sn * 9;
        int tot = num - mul;
        int p1,p2;
        System.out.println("The number after substract from "+sn+" number");
        int res1 = sumofdigit(tot);      
        int res2 = sumofdigit(num);      
        
        if (res1 == res2) {
            System.out.println("Trick is working : ");
        }
        else{
                p1 = sumofdigit(res1);
                p2 = sumofdigit(res2);
                System.out.println("Trick is still working if we add the number and convert into single digit : ");
                System.out.println("res1 = "+p1);
                System.out.println("res2 = "+p2);
            }
        }
}