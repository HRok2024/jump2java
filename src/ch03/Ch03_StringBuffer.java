package ch03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {
        // 문자열을 추가하거나 변경할때 사용하는 자료형(type)이다
        StringBuffer sb = new StringBuffer(); // StringBuffer 타입의 객체 sb를 생성
        // 버퍼 객체는 append 메소드를 사용해서 문자열을 추가한다.
        sb.append("Hello");
        sb.append(" ");
        sb.append("점프 2 자바");

        System.out.println(sb);

        // sb대신 문자열로 만들어보기 ("" 문자열(리터럴)을 만들면 수정할 수 없다. result에 계속 값을 새로 저장하는 방식이라 비효율적이다)
        String result = "";
        result +="헬로우"; // result = result + "헬로우";
        result +=" ";
        result +="점프 to 자바";
        System.out.println(result);

        // insert 특정 위치에 문자열을 삽입
         StringBuffer sb2 = new StringBuffer();
         sb2.append("jump to java");
         sb2.insert(0,"hello "); // 0번째에 인덱스가 추가된다
        System.out.println(sb2);
        // substring 문자열 잘라내기(위치를 지정해서 문자열 골라내기)
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb3.substring(0,4));
    }
}
