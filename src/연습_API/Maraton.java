package 연습_API;

import java.util.HashMap;

public class Maraton {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"병주","병헌","승언"},new String[]{"병헌","승언"}));
        System.out.println(solution(new String[]{"병주","병헌","승언","송군"},new String[]{"병주","병헌","송군"}));
        System.out.println(solution(new String[]{"병주","병헌","승언","병헌"},new String[]{"병주","병헌","승언"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        /*해쉬맵 hm을 생성한다. 참가자 이름과 함께 인원수를 적을수 있도록 자료형 만들기*/
        HashMap<String, Integer> hm = new HashMap<>();

        /*참가자 배열에서 이름을 하나씩 꺼내어 이름과 숫자 1을 해쉬맵에 추가*/
        /*이때 중복되는 이름은 중복되는 만큼 숫자를 더한다*/
        for (String name : participant) {
            if(hm.get(name)==null){
                hm.put(name,1);
            } else {
                int value =hm.get(name)+1;
                hm.put(name,value);
            }
        }

        for (String name : completion) {
            /*마라톤 완주자 이름은 해쉬맵에서 -1해준다.*/
            hm.put(name, hm.get(name)-1);
        }

        for (String name : hm.keySet()) { //해시맵 요소를 전체 반복
            if(hm.get(name)==1){
                answer = name;
            }
        }
        return answer;
    }
}
