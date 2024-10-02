package 연습_자바시작하기;

public class Ex13 {
    public static void main(String[] args) {
        double time=5.0; //이동시간
        double gravity=-9.81; //중력 가속도
        double initialVelocity=0.0; //초기 속도
        double initialPosition=1000.0; //초기 위치

        double finalPosition=gravity*time*time/2+initialVelocity*time+initialPosition;

        System.out.printf("5.00초 후 위치:%5.2fm", finalPosition);
    }
}
