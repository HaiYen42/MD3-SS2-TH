package GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho phương trình 'a*x + b= c', vui lòng điền số");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng điền a");
        double a= scanner.nextDouble();
        System.out.println(" Vui lòng điền b");
        double b= scanner.nextDouble();
        System.out.println("Vui lòng điền c");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.println(" Nghiệm của phương trình là "+ x);
        }else{
            if (b==c){
                System.out.println("Phương trình có vô số nghiệm");
            } else{
                System.out.println(" Phương trình vô nghiệm");
            }
        }
    }
}
