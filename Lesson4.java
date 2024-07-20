public class Main
{
    public static void main(String[] args)
    {
        // Условные конструкции if-else
        int a = 10;
        int x = 9;
        String name = "Fedor";

        if (a == 9)
        {
            System.out.println("Hello England !");
        }
        // else if должно быть между if и else
        else if (a == 10)
        {
            System.out.println("Hallo Deutsch !");
        }
        // Знак || нужно чтобы одно условие было правельным
        if (a == 1|| a == 2 )
        {
            System.out.println("Interesting....");
        }
        // Два амперсанта обозначают что каждое из условий должно быть верным
        if (a == 10 && x == 9)
        {
            System.out.println("Yes");
        }
        // Для проверки строки используеться перменная.equals("...")
        if (name.equals("Fedor"))
        {
            System.out.println("Имя пользователя Fedor");
        }
        else {
            System.out.println("Привет Россия !");
        }

        // Switch - case
        // Default - это else для switch - case
        int number = 1;
        switch(number)
        {
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println("Это else для switch - case");
        }

        int z = 5;
        if (z != 4)
        {
            System.out.println("Пермернная x не равна 4");
        }


    }
}
