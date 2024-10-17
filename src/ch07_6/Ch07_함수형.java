package ch07_6;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
}
class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

public class Ch07_함수형 {
    public static void main(String[] args) {
        //일반적인 클래스로 객체를 만들 경우
        Calculator mc = new MyCalculator();
        int result = mc.sum(5, 3);
        System.out.println(result);
        //객체가 들어갈 자리에 익명클래스를 사용해서 만들기
        Calculator mc2 = (int a, int b) -> a + b;

        Calculator mc4 = new Calculator() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int result2=mc4.sum(5, 3);
        //람다식으로 익명 클래스를 대체
        Calculator mc3 = (int a, int b) -> a + b;
        int result3 = mc3.sum(5, 3);
        System.out.println(result3);
    }
}
