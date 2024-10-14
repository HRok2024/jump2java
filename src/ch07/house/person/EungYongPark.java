package ch07.house.person;

import ch07.house.HousePark;

public class EungYongPark extends HousePark {
    public static void main(String[] args) {
        EungYongPark e = new EungYongPark();
        //다른 패키지에서 접근할 수 없지만, 상속하면
        System.out.println(e.lastname);
    }
}
