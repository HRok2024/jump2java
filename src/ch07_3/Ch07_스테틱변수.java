package ch07_3;

class Counter{
    static int count = 0;

    public Counter() {
        //스테틱 변수는 공유된다, 객체를 만들기 전에도 사용이 되는 변수다
        // 객체마다 생성되는 객체변수가 아니라 count라는 변수는 클래스를 정의하면 바로 생성되는 변수이다(클래스변수)
        count++; //카운트 값 1증가
        System.out.println(count); //카운트값 출력
    }
    /*메서드 앞에 static이 붙고 객체 상관없이 사용가능*/
    public static int getCount() {
        return count;
    }
}

public class Ch07_스테틱변수 {
    public static void main(String[] args) {
        //스테틱변수(클래스변수)는 객체 만들기 전에 이미 존재하는 변수다
        Counter.count=10;
        System.out.println(Counter.getCount());
        double pi=Math.PI;
        Counter c1=new Counter(); //11
        Counter c2=new Counter(); //12 <- static변수이므로 공유가 된다
        Counter c3=new Counter(); //13
    }
}
