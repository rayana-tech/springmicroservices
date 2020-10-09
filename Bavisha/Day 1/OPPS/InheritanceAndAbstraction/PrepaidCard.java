package InheritanceAndAbstraction;

public abstract class PrepaidCard {
	private int CardNo;
	private double availableBalance;
	private double swipeLimit;
	public int getCardNo() {
		return CardNo;
	}
	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public double getSwipeLimit() {
		return swipeLimit;
	}
	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}
	 public abstract boolean swipeCard(int amount);
	 
	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	} 
	 static int rechargeCard (int amount) {
		 
		return amount;
		 
	 }
}
