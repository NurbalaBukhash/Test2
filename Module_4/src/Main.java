import Cat.Cat;
import Tank.Tank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {

            String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
            Pattern pattern = Pattern.compile("\\bs[a-z]*?s\\b");
            Matcher matcher = pattern.matcher(text);
            Matcher matcher2 = pattern.matcher(text);
            Matcher matcher3 = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println("Match found: " + matcher.group());
            }

            /*String text = "2000 2001 3003 4004";
            Pattern pattern = Pattern.compile("20\\d{2}");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println("Match found: " + matcher.group());
            }*/

            /*String text = "aba aba a!a abba adca abea";
            Pattern pattern = Pattern.compile("ab+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println("Match found: " + matcher.group());
            }*/

            /*String text = "aba aba a!a abba adca abea";
            Pattern pattern = Pattern.compile("a.{2}a");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println("Match found: " + matcher.group());
            }*/

            /*
            StringBuilder sb = new StringBuilder();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                sb.append("TEST");//3
                sb.insert(0, "ABC"); //130
                sb.delete(1,2);
            }
            System.out.println(sb);
            System.out.println((System.currentTimeMillis() - startTime));*/


            /*Tank tank = new Tank();
            tank.setX(1000);
            tank.setY(2000);
            tank.printPosition();*/

            /*
            // At (0;0) fuel=100
            Tank justTank = new Tank();
            justTank.goForward(200);
            justTank.printPosition();

            // At (10;10) fuel=100
            Tank anywareTank = new Tank(10, 10, 100);
            anywareTank.goBackward(-200);
            anywareTank.printPosition();

            // At (20;30) fuel=200
            Tank customTank = new Tank(20, 30, 200);
            customTank.goForward(201);
            customTank.printPosition();*/
        }

    }