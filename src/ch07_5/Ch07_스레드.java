package ch07_5;

import java.util.ArrayList;

//스레드를 상혹한 클래스(Sample)
class Sample extends Thread{
    int seq;
    //생성자
    public Sample(int seq) {
        this.seq = seq;
    }
    //런 메소드를 구현하기
    @Override
    public void run() {
        //실제 스레드 실행코드(스레드 => 시작 - 1초대기 - 종료)
        System.out.println(this.seq+" thread start."); //스레드 시작
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
            System.out.println("스레드 대기 예외발생 "+e.getMessage());
        }
        System.out.println(this.seq+" thread end."); //스레드 종료
    }
}

public class Ch07_스레드 {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i <10; i++) {
            Thread t=new Sample(i);
            t.start(); //각 샘플 스레드를 실행한다.
            threads.add(t);
        }
        for (Thread t : threads) {
            try {
                t.join(); //메인메서드가 스레드가 종료될 때까지 대기한다
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main 종료");
    }
}
