package test11;

import issues.Bond;
import issues.Portfolio;
import issues.Position;
import issues.Stock;
import issues.Stock.Market;

public class PortfolioTest {
    public static void main(String[] args) {
        Stock stock1 = new Stock("1234", "Japan", Market.NSE);
        Stock stock2 = new Stock("9876", "Japan", Market.NSE);
        Stock stock3 = new Stock("5432", "Japan", Market.NSE);
        Bond bond1 = new Bond("1234", "Japan", 20211205, 0.03);
        Bond bond2 = new Bond("9876", "Japan", 20211205, 0.03);
        Bond bond3 = new Bond("5432", "Japan", 20211205, 0.03);
    
        Position ps1 = new Position();  
        ps1.setIssue(stock1);
        ps1.setAmount(0.1);
    
        Portfolio por = new Portfolio();
        por.addPosition(ps1);
    }
}
