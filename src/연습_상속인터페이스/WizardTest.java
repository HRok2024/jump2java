package 연습_상속인터페이스;

public class WizardTest {
    public static void main(String[] args) {
        //객체 생성
        GreatWizard gandalf=new GreatWizard("간달프",100,100,100);
        //상태 출력
        System.out.println(gandalf.toString());
        //에너지볼트
        gandalf.energeVolt();
    }
}

class Novice{
    //필드
    protected String name;
    protected int hp;

    //생성자

    public Novice(String n, int h) {
        name = n;
        hp = h;
    }

    //toString
    public String toString(){
        return String.format("[Novice] %s(HP: %d),",name,hp);
    }
}

class Wizard extends Novice{
    //필드
    protected int mp;

    //생성자
    public Wizard(String n, int h,int m) {
        super(n,h);
        mp = m;
    }

    //에너지볼트
    public void energeVolt(){
        System.out.printf("%s의 에너지볼트!\n",name);
    }
}

class GreatWizard extends Wizard{
    int Shield;

    public GreatWizard(String n, int h, int m, int s) {
        super(n, h, m);
        Shield = s;
    }
    public String toString(){
        return String.format("[대마법사] %s(HP: %d, MP: %d, SHIELD: %d),",name,hp,mp,Shield);
    }
    public void energeVolt(){
        System.out.printf("%s의 에너지볼트!(대마법사 버프로 데미지 +30 추가)\n",name);
    }
}