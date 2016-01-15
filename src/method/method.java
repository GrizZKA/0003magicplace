package method;

public class method {
    public static void main(String[] args){
        int lion = 5;
        int tiger = 6;
        System.out.println(sum(lion, tiger));

        String name1 = "Penguin";
        String name2 = "Bird";
        System.out.println(birdOrnot(name1, name2));
    }

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    public static boolean birdOrnot(String a, String b){
        boolean c = a.equals(b);
        return c;
    }


}
