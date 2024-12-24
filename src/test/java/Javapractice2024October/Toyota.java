package Javapractice2024October;

public class Toyota extends Cars{
	
	public void Start() {
		
		System.out.println("Start method");
	}
	
	

	public static void main(String[] args) {
		
		
		Toyota t = new Toyota();
		
		t.Start();
		
		t.val();

	}

}
