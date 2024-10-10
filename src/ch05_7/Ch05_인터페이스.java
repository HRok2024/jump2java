package ch05_7;

interface Predater{
    //추상메서드 (구현이 되지 않은 메서드, 내용{몸통}이 없다)
    String getFood();
    //디폴트 메서드 (실제 구현된 메서드, 앞에 default 표시)
    default void printFood(){
        System.out.printf("내 사료는 %s다\n", getFood());
    }
}

interface Barkable{
    void bark();
}

class Animal{
    String name;
    void setName(String name){
        this.name = name;
    }
    void barkAnimal(Barkable animal){
        animal.bark();
    }
    //다형성, 하나의 객체가 여러 자료형 타입 Tiger와 Lion은 Animal 타입으로 선언 가능하다
    //호랑이와 사자타입의 메소드를 따로 만들 필요가 없다
    /*void barkAnimal(Animal animal){
        //instanceof는 실제객체가 클래스타입과 같으면 참 아니면 거짓
        if(animal instanceof Tiger){
            System.out.println("어흥");
        }else if(animal instanceof Lion){
            System.out.println("으르렁");
        }
    }*/
}
//상속은 1개만 가능하지만 인터페이스는 콤마로 구분하여 여러개가 가능하다
class Tiger extends Animal implements Predater, Barkable{
    @Override
    public String getFood() {
        return "사과";
    }

    @Override
    public void bark() {
        System.out.println("호랑이 어흥");
    }
}

class Lion extends Animal implements Predater, Barkable{
    @Override
    public String getFood() {
        return "바나나";
    }

    @Override
    public void bark() {
        System.out.println("사자 으르렁");
    }
}

class ZooKeeper{
    //인터페이스 Predator 를 구현한 객체를 입력가능
    public void feed(Predater p){
        System.out.println("먹이주기 "+p.getFood());
    }
}

public class Ch05_인터페이스 {
    public static void main(String[] args) {
        Tiger 호랑이=new Tiger();
        Lion 사자=new Lion();
        ZooKeeper z=new ZooKeeper();
        z.feed(호랑이); //인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(사자);
        //Predater p=new Predater(); 인터페이스 타입으로 객체를 만들 수는 없다
        Predater p1=new Tiger();
        p1.printFood(); //디폴트 메서드
        Predater p2=new Lion();
        p2.printFood(); //디폴트 메서드

        Animal animal=new Animal();
        animal.barkAnimal(호랑이);
        animal.barkAnimal(사자);
    }
}
