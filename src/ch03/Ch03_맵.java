package ch03;

import java.util.HashMap;

public class Ch03_맵 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        // map은 put으로 추가한다
        map.put("people","사람");
        map.put("baseball","야구");
        // 자료를 가져올때 get(키)
        System.out.println(map.get("people"));
        //containsKey 맵에 해당 key가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("people"));
        // 삭제는 remove, key값을 이용해서 삭제한다, 삭제된 값이 반환된다
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));
        //size : 갯수
        System.out.println(map.size());
        // keySet 맵의 모든 키를 리턴
        map.put("apple","사과");
        //map의 모든 key를 반환
        System.out.println(map.keySet());
        //map의 모든 value를 반환
        System.out.println(map.values());
    }
}
