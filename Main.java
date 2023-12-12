import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 컴퓨터가 뽑아낸 숫자
        int[] comNum = Baseball.generateRandom();
        System.out.println(Arrays.toString(comNum));
        int count=0;

        // 사용자에게 세자리 숫자 입력 받기
        while (true) {
            count++;

            System.out.println("세자리 숫자를 입력해주세요!");
            Scanner sc = new Scanner(System.in);

            // 사용자 입력 숫자
            int num = sc.nextInt();
            int[] inNum = {num/100, num%100/10, num%100%10};

            // S, B 담을 변수
            int s=0;
            int b=0;

            // 숫자의 값, 위치 비교
            for (int i=0 ; i < comNum.length ; i++) {
                for (int j=0 ; j < comNum.length ; j++) {
                    if (comNum[i] == inNum[j]) {
                        if(i==j) s++;
                        else b++;
                    }
                }
            }

            // SB 출력
            if (s==0 && b >0) System.out.println("B" + b);
            else if (b==0 && s >0) System.out.println("S" + s);
            else System.out.println("B" + b + "S" + s);

            // S=3 종료
            if (s==3) {
                sc.close();
                System.out.println("시도 횟수: " + count);
                System.out.println("게임을 종료합니다!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }

        }

    }
}