package ch07;

class Sample{
    private String secret;

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret(){
        return secret;
    }
}

public class CH07_접근제어자 {
    private String password;
    public static void main(String[] args) {
        /*접근 제어자 : 변수나 메서드에 사용권한을 설정*/
        /*private < default < protected < public*/
        CH07_접근제어자 ch =new CH07_접근제어자();
        ch.password="1234";
        /*private 은 같은 클래스에서만 사용이 가능하다*/
        Sample sample = new Sample();
//        sample.secret="비밀";
        sample.setSecret("비밀");
        String s=sample.getSecret();
        System.out.println(s);
    }
}
