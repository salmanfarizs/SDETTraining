package tenthday.ten;

public class Java8Internals {
	
	private String carComp;
	private int carPrice;
	
	public Java8Internals(String carComp,int carPrice) {
		
		this.carComp = carComp;
		this.carPrice = carPrice;
	}
	
	public String getCarComp() {
		return carComp;
	}
	public int getCarPrice() {
		return carPrice;
	}
	
	
	public void setCarComp(String carComp) {
		this.carComp = carComp;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

}
