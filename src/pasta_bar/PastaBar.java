package pasta_bar;

import java.util.Scanner;

public class PastaBar 
{

	public static void main(String[] args) 
	
	{
		Scanner s=new Scanner(System.in);
		
		String [] stalneMusterije = {"0631821832","066291282","0652322233","060823673"};
		
		String []sastojci= {"makarone", "spagete", "bolognese", "curetina", "govedja prsuta", "slanina",
				"piletina", "4 sira", "dimljeni sir", "parmezan", "pavlaka", " pesto sos", "napolitana",
				"povrce mix", "pecurke" , "kutija" };
		
		int [] cena= {50,60,120,120,140,100,100,100,80,50,80,80,80,50,50,20};
		int iznos=0;
		String sastojak=" ";
		System.out.println("Izvolite !!");
		while (!sastojak.equals("Poruci"))							
		{
			System.out.println("Izaberite sastojak za pastu: ");
			
			sastojak=s.next();
			if (nadjiSastojak(sastojci,sastojak)!=-1)
			{
				iznos =iznos + cena[nadjiSastojak(sastojci,sastojak)];
			}
		}
		System.out.println("Vasa pasta iznosi "+iznos+" rsd.");
		System.out.println("Prijatno!!");
	}
	public static int nadjiSastojak(String [] sviSastojci, String sastojak) 
	{
		int a=-1;
		for(int i=0; i<sviSastojci.length;i++)
		{

			if (sviSastojci[i].equals(sastojak))
			{
				a=i;
			}
		}		
		return a;
	}	
}
