public class ArrayEx01 {
    public static void main(String[] args) {

        int[] price = { 12000, 35000, 6000, 8400, 430000 };
//        int[] price = new int[]{ 12000, 35000, 6000, 8400, 430000 };

        String[] mbti = { "INFP", "ENFP", "ISTJ", "ESTJ" };
//        String[] mbti = new int[]{ "INFP", "ENFP", "ISTJ", "ESTJ" };


        System.out.println(price);
        System.out.println(mbti);

        System.out.println(price.length);
        System.out.println(mbti.length);


        for (int i = 0; i < mbti.length; i++) {

            System.out.println(mbti[i]);
        }
    }
}
