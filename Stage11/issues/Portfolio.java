package issues;


public class Portfolio {
    
    private int i ;
    private Position[] portfolio ;

    public void addPosition(Position p){
        boolean sameissue = false;
        int x = -1;
        if(i==0){

        }else {
            for(int j = 0; j < portfolio.length; j++){
                Issue ori = p.getIssue();
                Issue com = portfolio[j].getIssue();
                if(ori.equals(com)){
                    sameissue = true;
                    x = j;
                    break;
                }
            }
        }
        if(sameissue){
            double ap = p.getAmount();
            double as = portfolio[x].getAmount();
            portfolio[x].setAmount(ap + as);
        }else{
            i = i + 1;
            Position[] newpor = new Position[i];
            // for(int j = 0; j < portfolio.length; j++){
            //     newpor[j] = portfolio[j];
            // }

            System.arraycopy(portfolio, 0, newpor, 0, i-1);
            newpor[i - 1] = p;
            portfolio = newpor;
        }
    }
    
    public Position findPosition(Issue issue){
       boolean sameissue = false;
       int x = -1;
       for(int j = 0; j < portfolio.length; j++){
           Issue com = portfolio[j].getIssue();
           if(issue.equals(com)){
               sameissue = true;
               x = j;
               break;
           }
       }

       if(sameissue){
           return portfolio[x];
       } else {
           return null;
       }
    }
}