import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1<number2) {
            System.out.println(number2 + "es el mayor");
        }else{
            if(number2<number1){System.out.println(number1 + "es el mayor");
            }else{
                System.out.println("Los numeros son iguales");
            }
        }
    }
}