import java.util.Locale;
import java.util.Scanner;

public class TriangleClassfication {
    public static void main(String[] args) {
        //Setuping the variables
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter the 3 sides of a triangle: ");
        System.out.println("Side A: ");
        int a = sc.nextInt();
        System.out.println("Side B: ");
        int b = sc.nextInt();
        System.out.println("Site C: ");
        int c = sc.nextInt();
        boolean isTriangle = false;

        //Validation if is a triangle
        if (a+b > c){
            isTriangle = true;
            System.out.println("Is a valid triangle");
        }else if(a+c > b){
            isTriangle = true;
            System.out.println("Is a valid triangle");
        } else if (b+c > a) {
            isTriangle = true;
            System.out.println("Is a valid triangle");
        }else {
            isTriangle = false;
            System.out.println("Is not a valid triangle");
        }

        while(isTriangle){
            //Classifying the triangles
            if (a==b && a==c && b==c){
                System.out.println("Is a Equilateral trianle. ");
                break;
            } else if (a==b || b==c || c==a) {
                System.out.println("Is a Isoceles triangle. ");
                break;
            } else {
                System.out.println("Is a Scalene triangle");
                break;
            }
        }



    }
}
