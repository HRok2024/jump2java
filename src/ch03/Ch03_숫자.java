package ch03;

public class Ch03_숫자 {
    public static void main(String[] args) {
        // 정수 타입(자료형, 기본은 int)
        int age = 10;
        long count = 511236545456125L;
        // 실수 (기본은 double)
        float pi = 3.141592f; // 특별한 경우를 제외하면 사용하지 않는다
        double pi2 = 3.1415926;

        // 8진수(0으로 시작)와 16진수(0x로 시작)의 표기 방법
        int oxtal = 023;
        int hex = 0xC3;
        System.out.println(oxtal);
        System.out.println(hex);
        // 숫자 연산( + - * /) : 사칙연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3); // 나머지
        System.out.println(3%7);

        //증감연산 (++ --) : 1씩 증가, 감소
        int i = 0;
        int j =10;
        i++; // i = i + 1;
        j--; // j = j - 1;
        System.out.println(i); // 1
        System.out.println(j); // 9
        // 증감연산자가 앞에 있을때에는 먼저 증감해주고, 뒤에 있을때에는 뒤에 증감해준다
        System.out.println(++i); // 2
        System.out.println(j--); // 9 ==> 8이 됨.
        System.out.println(j); // 8
        int x = i++; // x = 2, i = 3
        int y = i + --j; // y = 10 <== i = 3, j = 7
        System.out.println(x);
        System.out.println(y);
    }
}
