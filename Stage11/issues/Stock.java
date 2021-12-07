package issues;

public class Stock extends Issue{
    public enum Market{
        TSE,
        OSE,
        NSE
    }

    private Market market;

    public Stock(String code, String name, Market market){
        super(code, name);
        if(market == null){
            throw new IllegalArgumentException();
        }else{
            this.market = market;
        }
    }

    public Market getMarket(){
        return market;
    }

    @Override
    public String toString(){
        return "コード：" + getCode() + ", 名称：" + getName() + ", 上場市場：" + String.valueOf(market);
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getMarket() == null) ? 0 : getMarket().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Stock other = (Stock) obj;
		if (getCode() != other.getCode()){
            return false;
        }

        if (getName() != other.getName()){
            return false;
        }

        if (getMarket() != other.getMarket()){
            return false;
        }
    

		return true;
	}
}
