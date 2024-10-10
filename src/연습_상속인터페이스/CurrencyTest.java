package 연습_상속인터페이스;

public class CurrencyTest {
    public static void main(String[] args) {
        //객체생성
        KRW krw=new KRW(1500,"원");
        USD usd=new USD(100.50,"달러");
        EUR eur=new EUR(260.87,"유로");
        JPY jpy=new JPY(1400,"엔");
        //부모 클래스를 통한 그룹화
        Currency[] currencies={krw,usd,eur,jpy};
        //모든 화폐정보를 출력
        for(Currency cu:currencies){
            System.out.println(cu.toString());
        }
    }
}

class Currency {
    double amount; //수량(1000)
    String notation; //표기법(원)

    public Currency(double a, String n) {
        amount = a;
        notation = n;
    }

    public String toString() {
        return "";
//        return String.format("%s: %d 원", notation, amount);
    }
}

class KRW extends Currency {
    public KRW(double a, String n) {
        super(a,n);
    }
    public String toString() {
        return String.format("KRW: %.2f %s", amount,notation);
    }
}

class USD extends Currency {
    public USD(double a, String n) {
        super(a,n);
    }
    public String toString() {
        return String.format("USD: %.2f %s", amount,notation);
    }
}

class EUR extends Currency {
    public EUR(double a, String n) {
        super(a,n);
    }
    public String toString() {
        return String.format("EUR: %.2f %s", amount,notation);
    }
}

class JPY extends Currency {
    public JPY(double a, String n) {
        super(a,n);
    }
    public String toString() {
        return String.format("JPY: %.2f %s", amount,notation);
    }
}