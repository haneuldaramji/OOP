//Homework2.java
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student[] std = new Student[3];

        for(int i = 0; i<3; i++) {
            std[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            std[i].setId(sc.next());
            std[i].setName(sc.next());
            std[i].setMajor(sc.next());
            std[i].setPhone(sc.next());

        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i=0; i<3; i++){

            if(i==0){
                System.out.print("첫번째 학생: ");
            }
            else if (i==1){
                System.out.print("두번째 학생: ");
            }
            else {
                System.out.print("세번째 학생: ");
            }
            String phoneStr = "0"+ std[i].getPhone();
            String phone_formatted = phoneStr.substring(0,3)+ "-" +
                    phoneStr.substring(3,7) + "-" +
                    phoneStr.substring(7);
            System.out.printf("%d %s %s %s\n",std[i].getId(), std[i].getName(), std[i].getMajor(), phone_formatted);

        }

    }
}
