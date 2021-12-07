package test11;

import issues.Stock;
import issues.Stock.Market;

public class Stock2Test {
    public static void main(String[] args) {
        try{
            Stock stock = new Stock(null, "Japan", Market.TSE);
        } catch(IllegalArgumentException e){
            System.out.println("テスト（コードがnull）OK");
        }

        try{
            Stock stock = new Stock("1234", null, Market.TSE);
        } catch(IllegalArgumentException e){
            System.out.println("テスト（名称がnull）OK");
        }

        try{
            Stock stock = new Stock("1234", "Japan", null);
        } catch(IllegalArgumentException e){
            System.out.println("テスト（上場市場がnull）OK");
        }
    }
}
