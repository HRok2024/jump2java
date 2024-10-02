package 연습_자바시작하기;

public class Ex09 {
    public static void main(String[] args) {

        double  meter=100;
        double sec=18;
        double km=1000;
        double hour=3600;

        double ms=meter/sec;
        double kmh=hour/km;

        double hp=ms*kmh;
        System.out.println(hp+"km/h");
    }
}
