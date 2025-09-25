//homework1.java
import java.util.Scanner;
public class Homework1 {
    public static void main (String[] args){
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("정수를 입력하세요:");
            int op2 = sc.nextInt();
            sum += op2;
            System.out.printf("\n현재까지 입력된 정수의 합은 %d입니다.\n",sum);
        }
    }
}
