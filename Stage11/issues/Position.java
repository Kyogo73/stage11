package issues;

public class Position{
    private double amount;
    private Issue issue;

    public double getAmount(){
        return this.amount;
    }

    public Issue getIssue(){
        return this.issue;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setIssue(Issue issue){
        this.issue = issue;
    }
}
