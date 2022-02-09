
public class Comparison {
    public static void main(String[] args) {
        String a = "abhishek";
        String b = "abhishek";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("abhishek");
        String name2 = new String("abhishek");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
