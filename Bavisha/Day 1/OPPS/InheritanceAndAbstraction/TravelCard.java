package InheritanceAndAbstraction;

public class TravelCard extends PrepaidCard{
	private int rewardPoints;
	
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public boolean swipeCard(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
