public class ConditionsAndCycles {
        public static void main(String[] args) {
            int a = 4, b = 3, c = 2;
            //b = b + c; //5
            a = a * b; //12
            c = a - c; //10
            a = a + b; //15
            a = a - b; //12
            c = a + b; //15
            //b = c / a; //
            a = b + c; //18
            //a = a + c + b; //

            // Напишите здесь свой код
            for (int i = 1; i <= 20; i++){
                System.out.println(i + " -> " + a);
            }
        }
}