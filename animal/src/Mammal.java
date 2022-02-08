
public class Mammal extends Animal 
{
	String Color;
	
	public  Mammal() { }
	
	public  Mammal(String n, String c) { name = n; Color = c; }
	
	public String MammarGlands() { return "milk"; }
	
	public String BloodTemperature() { return "warm"; }

}
