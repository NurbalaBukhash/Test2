/*public class SimpleNumbers {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i ++){
            boolean isExit = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isExit = false;
                    break;
                }
            }

            if(isExit){
                System.out.println(i);
            }
        }
    }
}*/
public class SimpleNumbers {
    public static void main(String[] args) {
        int value = add(7, 8);
        int result = add(value, 15);
        System.out.println(result);
    }
    private static int add( int x, int y) {
        int result = (x + y);
        return result;
    }
}