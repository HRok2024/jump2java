package 연습_API;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        /*이름을 키, 이메일을 값으로 해서 해시맵 생성*/
        HashMap<String, String> emails = new HashMap<String, String>();

        /*데이터 저장*/
        emails.put("나리", "nari@cloudstudying.kr");
        emails.put("정애", "jungae@cloudstudying.kr");
        emails.put("홍팍", "sehong@cloudstudying.kr");
        /*해시맵의 크기를 출력*/
        System.out.printf("email.size() -> %d\n",emails.size());
        //key 목록 출력
        System.out.println("\n== ket set ==");
        for(String aa:emails.keySet()){
            System.out.println(aa);
        }
        //value목록 출력
        System.out.println("\n== values ==");
        for(String aa:emails.values()){
            System.out.println(aa);
        }
    }
}
