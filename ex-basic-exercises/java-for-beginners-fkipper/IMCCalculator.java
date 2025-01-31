import java.util.Locale;
import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("What's your wheight: ");
        float wheight = sc.nextFloat();
        System.out.println("What's your height: ");
        float height = sc.nextFloat();
        System.out.println("Wheight: " + wheight + " Height: " + height);
        float formulaImc = wheight/(height*height);

        if (formulaImc < 18.5){
            System.out.println("Your IMC is: " + formulaImc + " You are underweight ");
        }else if (formulaImc> 18.5 && formulaImc < 24.9){
            System.out.println("Your IMC is: " + formulaImc + " You are normal wheight ");
        }else if (formulaImc > 25.0 && formulaImc < 29.9 ){
            System.out.println("Your IMC is: " + formulaImc + " You are overwheight ");
        }else if (formulaImc>=30.0){
            System.out.println("Your IMC is: " + formulaImc + " You are obese ");
        }else {
            System.out.println("Have something wrong....");
        }
    }
}
