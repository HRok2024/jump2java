package ch03;

public class Ch03_배열 {
    public static void main(String[] args) {
        // 정수 int 배열
        int[] odds = {1, 3, 5, 7, 9};//배열을 지정할땐 {}를 사용한다
        // 문자열 String 배열
        String[] weeks={"월","화","수","목","금","토","일"};

        // 배열을 객체로 만들기 (new 키워드)
        String[] week = new String[7]; // 배열의 길이를 지정(7), 이 방법은 처음에 초기'값'이 없다, 빈 배열만 만든다
        week[0] = "월";
        week[1] = "화";
        week[2] = "수";
        week[3] = "목";
        week[4] = "금";
        week[5] = "토";
        week[6] = "일";
        // week[7] = "없는요일"; 배열의 길이가 7이면 인덱스는 0부터 6까지이므로 7은 배열에서 없는 자리이다
        
        // 배열값에 접근하기 목요일 값은 3(0,1,2,3)
        System.out.println(weeks[3]);
        System.out.println(week[3]);

        // 전체 배열의 값을 한번에 출력
//        System.out.println(week[0]);
//        System.out.println(week[1]);
//        System.out.println(week[2]);
//        System.out.println(week[3]);
//        System.out.println(week[4]);
//        System.out.println(week[5]);
//        System.out.println(week[6]);
        // 반복문을 사용해서 배열의 전체 값들을 출력

        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
    }
}
