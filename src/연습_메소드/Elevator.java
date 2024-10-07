package 연습_메소드;

public class Elevator {
    public static void main(String[] args) {
        //변수 생성
        int a =13;
        int b=7;
        int c=10;

        //결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n",a,guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n",b,guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n",c,guide(c));
    }

    private static String guide(int a) {
        String abc="";
        if (a<=20||a>=11){
            abc="고층 엘레베이터";
        } else {
            abc="저층 엘레베이터";
        }
        return abc;
    }
}
