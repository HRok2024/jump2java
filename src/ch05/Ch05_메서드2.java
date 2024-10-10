package ch05;

class Sample2{
    int a;//객체 변수
    void varTest(Sample2 b){
        b.a++;
    }
}

class Updater{
    void update(Counter c){
        c.count++;
    }
}

class Counter{
    int count=0;
}

public class Ch05_메서드2 {
    public static void main(String[] args) {
        Sample2 sample123 = new Sample2();
        sample123.a=1;
        sample123.varTest(sample123);
        System.out.println(sample123.a);

        Sample2 s1=new Sample2();
        Sample2 s2=new Sample2();
        s1.a=1;
        s2.a=2;
        s1.varTest(s2);
        s1.varTest(s1);
        System.out.println(s1.a);
        System.out.println(s2.a);

        Counter c1=new Counter();
        System.out.println("업데이트 전 : "+c1.count);
        Updater u1=new Updater();
        u1.update(c1);
        System.out.println("업데이트 후 : "+c1.count);
    }
}
