package OOPS1;

public class I10_Sports extends I10_Magna {

	void audioSystem() {
		System.out.println("Audio System executed.");
	}
	
	public static void main(String[] args) {
		I10_Sports obj = new I10_Sports();
		engine();
		obj.audioSystem();
	}
}
