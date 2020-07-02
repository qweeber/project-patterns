package patterns.creational.singleton.ex1Coin;

public class Main {
    public static void main(String[] args) {
        Coin coin = Coin.getInstance();
        Coin coin1 = Coin.getInstance();

        //coin i coin1 : are the same object !
        System.out.println(coin == coin1);

        coin1.addMoreCoin();

        System.out.println(coin.getCoin());
        coin.addMoreCoin();
        coin.addMoreCoin();
        coin.addMoreCoin();

        System.out.println(coin.getCoin());
    }
}
