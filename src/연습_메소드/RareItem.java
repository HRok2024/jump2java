package 연습_메소드;

public class RareItem {
    public static void main(String[] args) {
        wear(2400,2000); //체력 2400, 마력 2000 => 아이템 장착 완료!
        wear(3800,1200); //체력 2800, 마력 1200 => 아이템을 착용할 수 없습니다.
    }

    private static void wear(int hp, int mp) {
        if (mp>=2000){
            System.out.println("아이템 장착 완료!");
        }else {
            System.out.println("아이템을 장착할 수 없습니다.");
        }
    }
}
