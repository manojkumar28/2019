package ques5;

public class Icelandic extends Horse{

	public static void main(String[] args) {
		Icelandic i1=new Icelandic();
		Icelandic i2=new Icelandic();
		Icelandic i3=new Icelandic();
		i3=i1;
		i1=i2;
		i2=null;
		i3=i1;

	}
	public void makeNoise() {
		System.out.println("vinny");	
			
		}
}
class Horse implements Animal{

	Long weight=1200L;
	public void makeNoise() {
	System.out.println("whinny");	
		
	}
	
}
interface Animal{
	void makeNoise();
}