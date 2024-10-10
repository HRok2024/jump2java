package 연습_상속인터페이스;

public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi=new Taxi();

        taxi.start();
        taxi.stop(2500);
    }
}

interface Meter{
    public int BASE_FARE=3000; //기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없다)
    public abstract void start();
    public abstract void stop(int distance);
}

class Taxi implements Meter{
    public void start() {
        System.out.println("운행을 시작합니다.");
    }
    public void stop(int distance) {
        System.out.printf("운행을 종료합니다. 요금은 %d원 입니다.",BASE_FARE+distance*2);
    }
}