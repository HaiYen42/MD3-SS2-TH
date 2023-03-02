package TinhNamNhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year ");
        year = scanner.nextInt();
        if (year %4==0){
            if (year %100 !=0){
                System.out.println(" là năm nhuận");
            }else if (year %400 ==0 ){
                System.out.println(" là năm nhuận");
            } else{
                System.out.println(" Ko phải là năm nhuận");
            }
        } else{
            System.out.println(" Ko phải là năm nhuận");
        }

    }
}
