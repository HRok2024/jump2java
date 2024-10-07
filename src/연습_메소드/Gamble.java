package 연습_메소드;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice()+dice()+dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액: $%.2f(%.0f원)",dollar,won);
    }

    private static double exchange(double dollar) {
        return dollar*12987;
    }

    private static double dice() {
        double a= Math.random()*10000%6;
        int b=(int)a;
        int d=0;
        switch (b){
            case 1:d=1;
            break;
            case 2:d=2;
                break;
            case 3:d=3;
                break;
            case 4:d=4;
                break;
            case 5:d=5;
                break;
            default:d=6;
                break;
        }
        return d;
    }

}
