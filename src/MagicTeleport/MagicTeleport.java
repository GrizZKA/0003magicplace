package MagicTeleport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicTeleport {
    public static void main(String[] args) throws IOException {

        System.out.println("Greetings in Magic Place!");
        System.out.println("Please input your: 1. name, 2. sex, 3. height, 4. weight, 5. hair color. Exactly in that order.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sex = reader.readLine();
        String height = reader.readLine();
        String weight = reader.readLine();
        String haircolor = reader.readLine();
        int sheight = Integer.parseInt(height);
        int sweight = Integer.parseInt(weight);
        System.out.println("So, your name: " + name + ", sex: " + sex + ", height: " + sheight + " cm, weight: " + sweight + " kg, and hair color: " + haircolor);

        System.out.println("You need use magic for which attribute? 1. name, 2. sex, 3. height, 4. weight, 5. hair color");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String magic = reader2.readLine();
        int smagic = Integer.parseInt(magic);

        if (smagic == 1){
            String newName = magicName(name);
            System.out.println("Now your name: " + newName + "!?!, sex: " + sex + ", height: " + sheight + " cm, weight: " + sweight + " kg, and hair color: " + haircolor + " - Don`t play with magic");
        }else if (smagic == 2){
            String newSex = magicSex(sex);
            System.out.println("Now your name: " + name + ", sex: " + newSex + "!?!, height: " + sheight + " cm, weight: " + sweight + " kg, and hair color: " + haircolor + " - Don`t play with magic");
        }else if (smagic == 3){
            int newHeight = magicHeight(sheight);
            System.out.println("Now your name: " + name + ", sex: " + sex + ", height: " + newHeight + " cm !?!, weight: " + sweight + " kg, and hair color: " + haircolor + " - Don`t play with magic");
        }else if (smagic == 4){
            int newWeight = magicWeight(sweight);
            System.out.println("Now your name: " + name + ", sex: " + sex + ", height: " + sheight + " cm, weight: " + newWeight + " kg !?!, and hair color: " + haircolor + " - Don`t play with magic");
        }else if (smagic == 5){
            String newHair = magicHair(haircolor);
            System.out.println("Now your name: " + name + ", sex: " + sex + ", height: " + sheight + " cm, weight: " + sweight + " kg, and hair color: " + newHair + " - Don`t play with magic");
        }else{
            System.out.println("You choose wrong number of attribute");
        }
    }

    public static String magicName(String a){
        String b = a + " IV";
        return b;
    }

    public static String magicSex(String a){
        String b = "Unknown";
        return b;
    }

    public static int magicHeight(int a){
        int b = a + 36789;
        return b;
    }

    public static int magicWeight(int a){
        int b = a + 1000000;
        return b;
    }
    public static String magicHair(String a){
        String b = " you are bald !?!";
        return b;
    }




}
