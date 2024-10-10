package 연습_API;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        //45개의 공을 만든다.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <=45; i++) {
            numbers.add(i); //1 ~ 45
        }
        //섞는다
        Collections.shuffle(numbers);
        //뽑는다
    }
}
