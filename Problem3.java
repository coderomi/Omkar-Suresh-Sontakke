import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Number:- ");
        int a=sc.nextInt();

        if(a%2==0){
            a=a-1;
        }

        for(int i=1;i<=a;i+=2){
            System.out.print(i+" ");
        }
    }
}
