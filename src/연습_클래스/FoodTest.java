package 연습_클래스;

public class FoodTest {
    public static void main(String[] args) {
        //음식 객체 생성
        Food chicken=new Food("치킨",18000);
        Food pizza=new Food("피자",28000);
        Food sushi=new Food("초밥세트",22000);

        //객체 배열에 음식 담기
        Food[] foods ={chicken,pizza,sushi};

        //모든 음식 정보 출력
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i].toString());
        }
    }
}

class Food{
    String name;
    int price;

    public Food(String name1, int price1){
        name=name1;
        price=price1;
    }
    public String toString(){
        return String.format("Food{name:%s,price:%d원}",name,price);
    }
}
