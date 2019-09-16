import java.awt.*;
import java.util.Scanner;

public class Shape {
    Scanner sc = new Scanner(System.in);

    public void Rectangle( int width, int height) {


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void RightTriangle(int height){
        for (int i = 0; i < height; i++) {
            //tao hang (row)
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //xuong dong khi hien thi ket qua cua tung hang
            System.out.println(" ");
        }

    }

    public void IsoscelesTriangle(int height){
        for (int i= height;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public void display() {

        int choice =-1;
        while (choice != 0) {

        System.out.println("____MENU____");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle " +
                "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
            System.out.println("Pleaseeee choose the one: ");
        int input = sc.nextInt();


            switch (input) {
                case 1:
                    System.out.println("Input height:");
                    int height = sc.nextInt();
                    System.out.println("Input width: ");
                    int width = sc.nextInt();
                    Rectangle(height, width);
                    break;
                case 2:
                    System.out.println("Input height: ");
                    height = sc.nextInt();
                    RightTriangle(height);
                    break;
                case 3:
                    System.out.println("Input height:");
                    height = sc.nextInt();
                    IsoscelesTriangle(height);
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    }


}
