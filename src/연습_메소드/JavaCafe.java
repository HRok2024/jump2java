package 연습_메소드;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    //시급과 일한 시간을 입력받아, 주급을 출력
    private static void printPay(double v, int i) {
        double pay = 0;
        if (v < 8) {
            System.out.println("최저시급보다 낮습니다");
            return;
        } else if (i >= 60) {
            System.out.println("주당 근무시간을 초과했습니다");
            return;
        } else {
            if (i <= 40) {
                pay = i*v;
            } else {
                pay = i*v +(v-40)* 1.5;
            }
        }
        System.out.printf("$ %.2f\n", pay);
    }
}
