import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(5);
        list1.add(100);
        list1.add("INFP");

        for (int i = 0; i < list1.size(); i++) {

            System.out.println(list1.get(i));
        }



        ArrayList<Integer> list2 = new ArrayList<Integer>(5);
        list2.add(100);
//        list2.add("INFP");

        for (int i = 0; i < list2.size(); i++) {

            System.out.println(list2.get(i));
        }

    }

}
