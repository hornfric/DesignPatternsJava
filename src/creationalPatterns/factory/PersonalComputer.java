package creationalPatterns.factory;

public class PersonalComputer extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	
	

	public PersonalComputer(String ram, String hdd, String cpu) {	
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {		
		return this.ram;
	}
	@Override
	
	public String getHDD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return null;
	}

}
