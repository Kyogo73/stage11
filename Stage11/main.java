import issues.Issue;
import issues.Portfolio;
import issues.Position;
import issues.Stock;
import issues.Stock.Market;

public class main {
    public static void main(String[] args) {
        Position p = new Position();
        Stock s = new Stock("1234", "name", Market.NSE);
        p.setAmount(1.2);
        p.setIssue(s);
        System.out.println(p);
        System.out.println(p.getAmount());
        System.out.println(p.getIssue());
        Portfolio po = new Portfolio();
        po.addPosition(p);
    }
}
