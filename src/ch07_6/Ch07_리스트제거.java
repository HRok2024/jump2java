package ch07_6;

import java.util.ArrayList;
import java.util.List;

public class Ch07_리스트제거 {
    public static void main(String[] args) {
        //정수 리스트
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(10);
        list.add(9);
        list.add(1);
        list.add(5);

        //6보다 작은 숫자는 제거
        list.removeIf(x -> x<6);
        //출력
        list.forEach(x->System.out.println(x)); //7, 9, 10

        //아이템을 리턴값으로 바꿈
        list.replaceAll(n->n*n); //49, 81, 100
        list.forEach(x->System.out.println(x));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Integer x : list) {
            System.out.println(x);
        }
    }
}
