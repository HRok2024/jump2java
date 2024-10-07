package 연습_배열과반복문;

public class Factorial {
    public static void main(String[] args) {
        //입력값 받기
        int number=4;

        //결과 출력
        printFactorial(number);
    }

    //정수 n을 입력받아 n!의 결과를 출력
    private static void printFactorial(int n) {
        int result=1;
        System.out.printf("%d! = ",n);
        for (int i = n; i>0; i--) {
            System.out.printf("%d",i);
            result *= i;
            if (i !=1){
                System.out.printf(" x ");
            }
        }
        System.out.printf(" = %d\n",result);
    }
}
