package 연습_상속인터페이스;

public class VariousFriends {
    public static void main(String[] args) {
        //객체 생성
        Artist kim=new Artist("뮤지션 김씨");
        Architect lee=new Architect("건축가 이씨");
        Developer park=new Developer("개발자 박씨");
        Lawyer choi=new Lawyer("변호사 최씨");

        //그룹화: 인터페이스 기준
        Friend[] friends=new Friend[]{kim,lee,park,choi};
        for (Friend f:friends){
            f.dearFriend();
        }
    }
}

interface Friend{
    public void dearFriend();
}

class Artist implements Friend{
    private String name;
    public Artist(String n) {
        name = n;
    }
    public void dearFriend() {
        System.out.printf("%s->칭구 아이가!\n",name);
    }
}

class Architect implements Friend{
    private String name;
    public Architect(String n) {
        name = n;
    }
    public void dearFriend() {
        System.out.printf("%s->칭구 아이가!\n",name);
    }
}

class Developer implements Friend{
    private String name;
    public Developer(String n) {
        name = n;
    }
    public void dearFriend() {
        System.out.printf("%s->칭구 아이가!\n",name);
    }
}

class Lawyer implements Friend{
    private String name;
    public Lawyer(String n) {
        name = n;
    }
    public void dearFriend() {
        System.out.printf("%s->칭구 아이가!\n",name);
    }
}