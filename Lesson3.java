import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Математические операции

        В Java можно выполнять все математические операции. Это такие операции, как:

        вычитание - z = y - x;
        сложение - z = y + x;
        умножение - z = y * x;
        деление - z = y / x (на ноль делить нельзя);
        остаток при делении - z = y % x;
         */
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scan.nextLine();
        System.out.println("Hello " + username);
        System.out.print("Enter your age: ");
        int num1 = scan1.nextInt();
        System.out.print("Age: " + num1);
    }
}
