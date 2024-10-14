package ch07.house;

public class HousePark {
    /*protected는 같은 패키지 + 이 클래스를 상속받은 클래스*/
    protected String lastname="park";
    public static void main(String[] args) {
        //같은 패키지의 클래스는 import를 하지 않는다(자동)
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
    }
}
