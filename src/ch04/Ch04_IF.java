package ch04;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Ch04_IF {
    public static void main(String[] args) {
        /* Ctrl+Shift+/ 는 여러줄 주석*/
        /* if 문 */
        int money = 2000;
        boolean hasCard = true;
        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 간다.");
        } else {
            System.out.println("걸어간다.");
        }

        //if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money1")) {
            System.out.println("택시를 타고 간다.");
        } else if (hasCard) {
            System.out.println("카드로 택시를 타고 간다.");
        } else {
            System.out.println("걸어간다.");
        }
    }
}
