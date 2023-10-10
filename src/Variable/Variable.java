public class Variable {
    public static void main(String[] args) {
//- **하나의 변수는 단 하나의 값만 저장할 수 있다.**
//- **변수에 저장된 값은 재할당을 통해 변경될 수 있다.**
//- **Java에서의 변수는 값의 형태에 맞는 자료형을 지정해주어야 한다.**
//- **소문자로 시작해야 하며, 숫자로 시작할 수 없다.**
//- **대소문자를 구분하며, 공백이 포함될 수 없다.**
//변수자료형
        int num = 31;
        String name = "김건우";
        double height = 186.5;
        System.out.println(name + " 키: " + height + "입니다.");
        System.out.println("num: " + num);
        System.out.println("height: " + height);
        System.out.println("name: " + name);
    }
}
