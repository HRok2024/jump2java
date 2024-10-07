package 연습_배열과반복문;

public class ThreeCombos {
    public static void main(String[] args) {
        //n을 만드는 3가지 수 출력
        printCombos(10);
    }

    public static void printCombos(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i*j*k==10) {
                        System.out.printf("%d = %d x %d\n", n, i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.println("=================");
        System.out.printf("경우의 수: %d\n", count);
    }
}
