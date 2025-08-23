package OOP_LAB_05;


	
	class Transport {
		
		void price() {
			
			System.out.println("Bus Ticket Price : $12");
			System.out.println("Train Ticket Price : $10");
			
		}
	}
	
	class bus extends Transport {
		
		void price() {
			System.out.println("Bus Ticket Price : $15");
		}
		
	}
	
	class trains extends Transport{
		
		void price() {
			System.out.println("Train Ticket Price : $13");
		}
	}
	
	public class Transportation_System {
		
		public static void main(String[] args) {
			
			Transport T1 = new bus();
			T1.price();
			
			Transport T2 = new trains();
			T2.price();
				
			
		}

}
