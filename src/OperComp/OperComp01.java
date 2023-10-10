import java.sql.SQLOutput;

public class OperComp01
{
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 0;
        String str = "Kim";

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);

        System.out.println(num1 <= num2);
        System.out.println(num1 <= num3);

        System.out.println(num1 >= num2);
        System.out.println(num1>= num3);

        System.out.println(num1 == num2);
        System.out.println(num1 == num3);

        System.out.println(num1 != num2);
        System.out.println(num1 != num3);

        System.out.println(str.equals("Kim"));
    }
}
