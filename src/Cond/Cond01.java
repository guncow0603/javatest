public class Cond01 {
    public static void main(String[] ags){
        int num1 = 1;
        int num2 = 50;

        if (num1 != num2) {
            System.out.println("num1 != num2");
        }


        if (num1 == num2) {
            System.out.println("num1 == num2");
        } else if (num1 < num2) {
            System.out.println("num1 < num2");
        }


        if (num1 == num2) {
            System.out.println("num1 == num2");
        } else if (num1 > num2) {
            System.out.println("num1 > num2");
        } else {
            System.out.println("Exited");
        }
    }
}
