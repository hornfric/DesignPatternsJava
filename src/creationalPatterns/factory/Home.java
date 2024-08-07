package creationalPatterns.factory;

public class Home {
	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer("PC", "16 GB", "500 GB", "1.8 GHZ");
		Computer server=ComputerFactory.getComputer("SERVER", "256 GB", "1 TB", "2.4 GHZ");
		System.out.println("Computer PC:"+pc);
		System.out.println("Server Computer:"+server);
	}

}
