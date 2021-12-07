package issues;

public class Bond extends Issue{
    private Integer maturity;
    private Double coupon;

    public enum BondType{
        COUPON_BOND,
        ZERO_COUPON_BOND
    }

    public Bond(String code, String name, Integer maturity, Double coupon){
        super(code, name);

        if(20000101 > maturity){
            throw new IllegalArgumentException();
        } else if(29991231 < maturity){
            throw new IllegalArgumentException();
        } else {
            this.maturity = maturity;
        }

        if(coupon >= 0){
            this.coupon = coupon;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMaturity(){
        return this.maturity;
    }

    public double getCoupon(){
        return this.coupon;
    }

    public BondType getBondType(){
        if(coupon != 0){
            return BondType.COUPON_BOND;
        }else{
            return BondType.ZERO_COUPON_BOND;
        }
    }

    @Override
    public String toString(){
        return "コード：" + getCode() + ", 名称：" + getName() + ", 償還年月日：" + Integer.toString(maturity) + ", クーポンレート：" + String.valueOf(coupon);
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		long temp;
		temp = Double.doubleToLongBits(coupon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + maturity;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
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

		Bond other = (Bond) obj;
		if (getCode() != other.getCode()){
            return false;
        }

		if (coupon != other.coupon) {
			return false;
		}
		if (maturity != other.maturity) {
			return false;
        }

        if (getName() != other.getName()){
            return false;
        }
		return true;
	}
}