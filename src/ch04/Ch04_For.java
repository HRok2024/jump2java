package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch04_For {
    public static void main(String[] args) {
        /* for 반복문, 세미콜론 구분자 */
        String[] n={"one","two","three"};
        /* for(초기값; 조건문;증가값;) */
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        
        /* 예시 : 5명이 시험을 봤는데 점수가 60점을 넘으면 합격이고, 아니면 불합격 */
        int[] marks={90,25,67,45,80};
        for (int i = 0; i < marks.length; i++) {
            /*if (marks[i]>=60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }*/
            /* 합격한 학생만 출력하기 */
            if (marks[i]<=60){
                continue; // 불합격은 출력하지 않는다
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }

         /*2중 for 문 : for문 안에 for문을 사용*/
        /*구구단 출력(2단부터 9단까지)*/
        for (int i = 2; i < 10; i++) {
            System.out.println(i+"단");
            for (int j = 1; j < 10; j++) {
                int a=i*j;
                System.out.println(i+"*"+j+"="+a);
            }
            System.out.println();
        }

        /* for each 반복문 */

        ArrayList<String> numbers=new ArrayList<>(Arrays.asList("one","two","three"));
        for (String s:numbers){
            System.out.println(s);
        }
    }
}
