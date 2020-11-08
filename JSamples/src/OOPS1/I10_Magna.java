package OOPS1;

public class I10_Magna extends I10_Era {
	
	void powerWindows() {
		System.out.println("power windows method executed.");
	}
	
	public void autoMirrorAdjust() {
		System.out.println("auto mirrior method executed.");
	}
	
	public static void main(String[] args) {
		I10_Era era = new I10_Era();
		I10_Magna magna = new I10_Magna();
		
		era.body();
	}
	
}
