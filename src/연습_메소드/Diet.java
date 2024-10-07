package 연습_메소드;

public class Diet {
    public static void main(String[] args) {
        //변수 생성
        double w = 81.6;
        double t = 1.76;

        //BMI 계산
        double bmi = calculate(w, t);

        //결과출력
        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
        System.out.printf("결과: %s입니다.\n", result(bmi));
    }

    private static String result(double bmi) {
        String abc = "";
        if (bmi >= 30) {
            abc = "비만";
        } else if (bmi >= 25 || bmi <= 30) {
            abc = "과체중";
        } else if (bmi >= 18.5 || bmi <= 25) {
            abc = "정상";
        } else {
            abc = "저체중";
        }
        return abc;
    }

    private static double calculate(double w, double t) {
        return w / t / t;
    }
}
