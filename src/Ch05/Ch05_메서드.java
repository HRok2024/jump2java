package Ch05;

class Sample {
    //int a와 int b는 매개변수다
    int sum(int a, int b) {
        return a + b;
    }
    //리턴값이 없는 메서드
    void sum2(int a,int b){
        System.out.println(a+"와 "+b+"의 합은"+(a+b)+"입니다.");
        System.out.printf("%d와 %d의 합은 %d입니다.%n",a,b,a+b);
    }

    //입력값은 없고 문자열 "HI"가 반환된다
    String say(){
        return "HI";
    }

    //입력과 리턴이 둘 다 없는 메서드
    void hello(){
        System.out.println("헬로우!");
    }

    //return으로 메서드 빠져나오기(메서드에서 리턴을 만나면 종료된다, break같은건가보다)
    void sayNick(String name){
        if("사과".equals(name)){
            System.out.println("출력을 건너뜁니다.");
            return; //종료(아래의 코드는 실행안됨)
        }
        System.out.println("나의 별명은 "+name+"입니다.");
    }
}

public class Ch05_메서드 {

    public static void main(String[] args) {
        Sample sample = new Sample();
        //객체, 메소드명 => 메소드호출, 이때 전달하는 입력값을 인수(arguments)라고 한다
        int c = sample.sum(3,4);
        System.out.println(c);

        String say=sample.say();
        System.out.println(say);

        sample.sum2(3,4);

        sample.hello();


        sample.sayNick("사과");
        sample.sayNick("오렌지");
    }
}
