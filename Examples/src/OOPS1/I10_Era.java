package OOPS1;

public class I10_Era {

		void body() {
			System.out.println("body method executed.");
		}
		
		static void engine() {
			System.out.println("engine method executed.");
		}
		
		private void manualWindows() {
			System.out.println("manual windows method executed.");
		}
		
		void gears() {
			System.out.println("gears method executed.");
		}
		
		public static void main(String[] args) {
			
			I10_Era era = new I10_Era();
			era.body();
			era.engine();
			era.manualWindows();
			era.gears();
		}
		
}
