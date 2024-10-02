package 연습_자바시작하기;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Double> sl=new ArrayList<Double>();
        sl.add(8.62);
        sl.add(10.23);
        sl.add(12.48);
        sl.add(7.82);
        sl.add(9.54);

        double sum = sl.get(0)+sl.get(1)+sl.get(2)+sl.get(3)+sl.get(4);
        System.out.printf("월요일 부터 금요일까지 얻은 총 수입은 $%4.2f입니다",sum);
    }
}
