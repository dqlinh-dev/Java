import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap a");
        int a= sc.nextInt();
        System.out.print("Nhap b");
        int b= sc.nextInt();
        int c= a+b;
        System.out.print("Tong:"+c);
    }
}