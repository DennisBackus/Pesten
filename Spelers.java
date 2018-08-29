package Pesten;

import java.util.ArrayList;

public class Spelers {
	ArrayList<Kaart> hand  = new ArrayList<>(); 
	public Spelers() {
	
	}
	

	public void handBekijken()	{
for (int a = 0; a <hand.size(); a++) {
	System.out.println(hand.get(a).getFullCard_name());
}}
	
}