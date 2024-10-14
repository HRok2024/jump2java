package 연습_API;

import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        /*메뉴 객체를 생성*/
        Menu kim=new Menu("김밥",2000,57);
        Menu don=new Menu("돈까스",6000,29);
        Menu nm=new Menu("냉면",5000,34);
        /*스토어 객체를 만들고 위의 메뉴를 추가*/
        Store store=new Store();
        store.add(kim);
        store.add(don);
        store.add(nm);
        /*하루 총 매출을 계산*/
        System.out.printf("총 매출: %d원",store.totalSales());
    }
}

class Store{
    private ArrayList<Menu> list;

    public Store(){
        list = new ArrayList<Menu>();
    }

    public void add(Menu menu){
        list.add(menu);
    }

    public int totalSales(){
        int sum=0;
        for(Menu menu : list){
            sum+=menu.getPrice()*menu.getCount();
        }
        return sum;
    }
}

class Menu{
    private String name; //메뉴명
    private int price; //가격
    private int count;  //하루 판매량

    public Menu(String name, int price, int count){
        this.name=name;
        this.price=price;
        this.count=count;
    }

    public int getPrice(){
        return price;
    }
    public int getCount(){
        return count;
    }
}
