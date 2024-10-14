package 연습_API;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TotalPrice {
    public static void main(String[] args) {
        /*구매 상품 객체를 생성*/
        Item shirts=new Item("스트라이프 셔츠",49900);
        Item pants=new Item("슬림 면바지",58900);
        Item shoes=new Item("스니커즈",46900);
        /*장바구니에 상품을 담으세요*/
        Cart myCart = new Cart();
        myCart.add(shirts);
        myCart.add(pants);
        myCart.add(shoes);
        //총합 출력
        System.out.printf("총합: %d원",myCart.totalPrice());
    }
}

class Cart{
    private ArrayList<Item> list;

    public Cart(){
        this.list = new ArrayList<Item>();
    }

    public void add(Item item){
        list.add(item);
    }

    /*장바구니 총합 메소드 완성시키기*/
    public int totalPrice(){
        int sum=0;
        for(Item a:list){
            sum+=a.getPrice();
        }
        return sum;
    }
}

class Item{
    private String name;
    private int price;

    public Item(String name, int price){
        this.name=name;
        this.price=price;
    }

    public int getPrice(){
        return price;
    }
}