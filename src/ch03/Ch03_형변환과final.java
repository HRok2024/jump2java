package ch03;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_형변환과final {
    public static void main(String[] args) {
        String num = "123"; //문자열
        int n = Integer.parseInt(num);
        System.out.println(n);

        String num2 = "3.123"; //문자열
        double n2 = Double.parseDouble(num2);
        System.out.println(n2);

        //반대로 정수를 문자열로 변환
        int n3 = 456;
        String num3 = "" + n; //문자열 더하기 숫자는 문자열이 된다
        String num4 = String.valueOf(n3);
        String num5 = Integer.toString(n3);

        //문자열을 실수로 변환
        String num6 = "123.456";
        double d = Double.parseDouble(num6);

        //정수와 실수 변환
        int n4 = 123;
        double d2 = n4; //정수에서 실수로 변환, 자동변환
        System.out.println(d2);
        double d3 = 123.456;
        int n5 = (int) d3;
        System.out.println(n5);

        //형변환시 주의점, 변환될 타입과 문자열의 내용이 맞지않으면 변환되지 않는다
        String num7 = "123.456";
        double n6 = Double.parseDouble(num7);

        //final 키워드는 값을 한번만 설정, 고정값이므로 바꿀수 없음
        final int n7 = 123;
//        n7=98;
        final ArrayList<String> a=new ArrayList<>(Arrays.asList("a","b"));
        a.add("c");
        System.out.println(a);
//        a=new ArrayList<>();

    }
}
