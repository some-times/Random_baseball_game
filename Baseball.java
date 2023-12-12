import java.util.Random;

public class Baseball {

    // random 숫자 만들기
    protected static int[] generateRandom () {
        Random random = new Random();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            int newRandom;
            do {
                newRandom = random.nextInt(10);
            } while(compare(number, newRandom));

            number[i] = newRandom;
        }
        return number;
    }

    private static boolean compare (int[] array, int value) {
        for(int num : array) {
            if(num == value) {
                return true;
            }
        }
        return false;
    }
}
