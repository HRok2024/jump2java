package 연습_자바시작하기;

public class Ex12 {
    public static void main(String[] args) {
        int num=374;
        int a=num/100;
        int b=num%100/10;
        int c=num%10;

        int sum=a+b+c;

        System.out.println("총합 : "+sum);
    }
}
