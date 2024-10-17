package ch07;

import java.io.*;

public class Ch07_예외처리 {
    public static void main(String[] args){
        //파일 찾기 예외처리, 실행하기 전에 오류를 알려준다
        //여기서 쓴 파일의 주소는 상대주소이며, 아무것도 쓰지 않아서 Ch07_예외처리라는 파일이 있는 위치를 가리키고 있다
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("없는파일.txt"));
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일 못찾음 예외발생 "+e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기 또는 닫기 예외발생"+e.getMessage());
        }
        //파일을 읽을 수 없는 경우에 예외처리
//        br.readLine();
//        br.close();
        //산술에 문제
//        try {
//            int c=4/0; //실행중에 예외가 발생한다
//        } catch (ArithmeticException e) {
//            System.out.println("수학예외 0으로 나누는 에러 발생!");
//        }

        //배열의 인덱스 번호가 틀림, 실행중에 문제가 발생한다 a[-1]
        try {
            int[] a={1,2,3};
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 넘기는 에러 발생!"+e.getMessage());
        }finally{
            System.out.println("에러발생 여부에 상관없이 실행된다");
        }
    }
}
