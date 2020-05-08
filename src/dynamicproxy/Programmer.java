package dynamicproxy;

public class Programmer implements People {
	
	@Override
	public String WorkAndGetReward() {
		System.out.println("Programmer works hard under 996.");
		return Reward();//==return this.Reward();
	}
	
	@Override
	public String Reward() {
		return "Then he goes icu.";
	}

}
