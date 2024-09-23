package task5;

public class Two {
    public static void main(String[] args) {
        int num;
        int num2;

        num = 3;
        num2 = 7;
        for (int i = 1; i <= 100; i++) {
            if ((i % num) == 0){
                System.out.println(i);
            } if ((i % num2)==0){
                System.out.println(i);
            }
        }
    }
}
