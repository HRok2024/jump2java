package ch07_3;

class Singleton{
    private static Singleton one;
    //생성자를 private으로 정의해서 다른 클래스에서 해당 객체를 만들지못하게 한다
    private Singleton(){}
    /*스테틱 메소드로 객체를 가져오기만 한다*/
    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton(); //단 한번 생성된다
        }
        return one; //처음에 만든 객체가 리턴된다
    }
}

public class Ch07_싱글턴 {
    public static void main(String[] args) {
        /*단 하나의 객체만 생성하게 한다*/
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1 == s3);
    }
}
