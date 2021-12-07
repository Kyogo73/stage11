package test11;

import issues.Stock;
import issues.Stock.Market;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("1234", "Japan", Market.TSE);
        stock.toString();
        
        Stock stock1 = new Stock("1234", "Japan", Market.TSE);
        if(stock.equals(stock1) == true){
            System.out.println("テストOK");
        } else {
            System.out.println("テストNO");
        }

        Stock stock2 = new Stock("9876", "Japan", Market.TSE);
        if(stock.equals(stock2) == true){
            System.out.println("テストNO");
        } else {
            System.out.println("テスト(コード)OK");
        }

        Stock stock3 = new Stock("1234", "America", Market.TSE);
        if(stock.equals(stock3) == true){
            System.out.println("テストNO");
        } else {
            System.out.println("テスト(名称)OK");
        }

        Stock stock4 = new Stock("1234", "Japan", Market.NSE);
        if(stock.equals(stock4) == true){
            System.out.println("テストNO");
        } else {
            System.out.println("テスト(上場市場)OK");
        }
        
        System.out.println(stock.equals(null));
        System.out.println(stock.equals("あいうえお"));
    }
}
