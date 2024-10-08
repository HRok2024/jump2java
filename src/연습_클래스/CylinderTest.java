package 연습_클래스;

public class CylinderTest {
    public static void main(String[] args) {
        //객체 생성
        Cylinder c=new Cylinder();
        //속성 값 입력
        c.r=4;
        c.h=5;
        //출력
        System.out.printf("원기둥의 부피: %.2f\n",c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n",c.getArea());

    }
}
class Cylinder{
    double r;
    double h;
    double p=Math.PI;
    double getVolume() {
        return p*r*r*h;
    }
    double getArea() {
        return 2*p*r*r+2*p*r*h;
    }
}
