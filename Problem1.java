import java.util.Scanner;

public  class Problem1  {
    public static double calculate(double a,double b,String op){
        switch (op){
            case "+":
                return  a+b;
            case "-":
                return  a-b;
            case "*":
                return  a*b;
            case "/":
                if(b!=0){
                    return a/b;
                }else{
                    return 0;
                }
            default:
                System.out.println("Invalid Operation");
                return 0;
        }

    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your first number:-");
        double a=sc.nextDouble();

        System.out.print("Enter your second number:-");
        double b=sc.nextDouble();


        System.out.print("Enter your operation (+ - * /):-");
        String op=sc.next();

        double result=calculate(a, b, op);
        System.out.println("Result is :-"+result);
    }
}