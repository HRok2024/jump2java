package 연습_API;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        //객체 생성
        LottoMachine machine = new LottoMachine();

        //로또 번호 가져오기
        int[] numbers = machine.getLottoNumbers();

        //결과 출력
        System.out.println("생성 번호: ");
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
    }
}

class LottoMachine {
    //필드
    private int[] LottoNumbers;
    //생성자

    public LottoMachine() {
        LottoNumbers = generate();
    }

    //메소드
    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random rand = new Random();

        /*임의의 숫자 6개를 만들어 배열 pickedNumbers에 입력한다.*/
        for (int i = 0; i < 6; i++) {
            pickedNumbers[i] = rand.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if (pickedNumbers[i] == pickedNumbers[j]) {
                    i--;
                    break;
                }
            }
        }

        return pickedNumbers;
    }

    public int[] getLottoNumbers() {
        return LottoNumbers;
    }
}
