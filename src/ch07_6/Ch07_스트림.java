package ch07_6;

import java.util.Arrays;
import java.util.Comparator;

public class Ch07_스트림 {
    public static void main(String[] args) {
        int[] data={5,6,4,2,3,1,1,2,2,4,8};
        int[] result=Arrays.stream(data) //배열을 스트림으로 바꿈
                .boxed() //Stream<Integer>
                .filter(x -> x % 2 == 0) //짝수만 뽑아낸다, predicate 는 정수입력 리턴 불린(참, 거짓)
                .distinct() //중복제거
                .sorted(Comparator.reverseOrder()) //역순정렬
                .mapToInt(x -> x) //IntStream 으로 변경
                .toArray(); //int[] 배열로 변경

        System.out.println(Arrays.toString(result));
    }
}
