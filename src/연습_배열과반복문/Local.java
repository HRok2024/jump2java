package 연습_배열과반복문;

public class Local {
    public static void main(String[] args) {
        //배열 생성
        String[] cities = {"서울","부산","인천","대전","대구"};
        int[] visitors = {599, 51, 46, 43, 27};

        for (int i = 0; i < cities.length; i++) {
            String[] city = new String[cities.length];
            city[i] = cities[i]+":"+visitors[i];
            System.out.println(city[i]);
        }
    }
}
