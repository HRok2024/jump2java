package 연습_자바시작하기;

public class Ex08 {
    public static void main(String[] args) {
        int is=7582;
        
        int h=is/3600;
        int m=is%3600/60;
        int s=is%60;

        System.out.println(h+"시간"+m+"분"+s+"초");
    }
}
