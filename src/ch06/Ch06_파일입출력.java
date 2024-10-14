package ch06;

import java.io.*;

public class Ch06_파일입출력 {
    public static void main(String[] args) throws IOException {
        /*파일 쓰기*/
//        FileOutputStream output = new FileOutputStream("c:/Temp/out.txt");
//        for (int i = 1; i < 11; i++) {
//            String data=i+" 번째 줄입니다. \r\n"; //\r\n은 커서를 맨앞으로 한줄 띄운다
//            output.write(data.getBytes()); //바이트로 쓰기
//        }
//        output.close();
//        /*FileWriter 문자열을 바로 쓸수있다, append 값이 true일때 추가로 쓰기가 가능하다*/
//        FileWriter fw = new FileWriter("c:/Temp/out.txt",true);
//        for (int i = 1; i < 12; i++) {
//            String data=i+" 번째 줄입니다. \r\n";
//            fw.write(data); //문자열을 바로 입력한다
//        }
//        fw.close();

        /*PrintWriter 는 println 메서드 사용*/
//        PrintWriter pw = new PrintWriter(new FileWriter("c:/Temp/out1.txt",true));
//        for (int i = 1; i < 12; i++) {
//            String data=i+" 번째 줄입니다.";
//            pw.println(data); //문자열을 바로 입력한다
//        }
//        pw.close();

//        /*파일 읽기 : 특정 주소의 파일을 읽어온다*/
//        FileInputStream input = new FileInputStream("c:/Temp/out.txt");
//        byte[] buf = new byte[1024]; //1024바이트 배열
//        input.read(buf);
//        String s=new String(buf);
//        System.out.println(s);
//        input.close();

//        /*문자열 단위로 읽는 방법 : 파일리더로 문자하나씩 읽고 버퍼리더로 한꺼번에 읽는다*/
//        BufferedReader br = new BufferedReader(new FileReader("c:/Temp/abc.txt"));
//        while(true){
//            String line = br.readLine();//한줄씩 읽는다
//            if (line == null) break; //더이상 읽을 줄(라인)이 없을때 반복문을 빠져나간다
//            System.out.println(line);
//        }
//        br.close();
    }
}
