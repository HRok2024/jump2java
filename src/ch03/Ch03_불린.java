package ch03;

public class Ch03_불린 {
    public static void main(String[] args) {
        // 불(boolean) : 참 또는 거짓 자료형
        boolean isSuccess = true; // 1
        boolean isTest = false; // 0
        // 참 또는 거짓을 판단하는 연산
        // 조건문에 사용하거나 불타입에 대입
        System.out.println(2>1); // 참
        System.out.println(2<1); // 거짓
        System.out.println(1==2); // 같은지 비교하는 연산자, 거짓
        System.out.println(1==1);
        System.out.println(3%2 == 1);

        // 조건문에 사용
        int base = 180;
        int h = 179;
        boolean isTall = h > base; // base보다 h가 크면 참이 된다
        // if 문에는 조건이 참일 경우에만 명령문을 실행한다
        if (isTall) {
            System.out.println("키가 큽니다.");
        }
    }
}
