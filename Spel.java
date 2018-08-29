package Pesten;

import java.util.ArrayList;

public class Spel {
	
	Deck spelDeck = new Deck(); 
	ArrayList <Kaart> stapel;
	ArrayList<Kaart> pile = new ArrayList<>(); 
	 Spelers spelerEen = new Spelers();
	   Spelers spelerTwee = new Spelers(); 
	
	public static void main(String[] args) {
	   
		Spel spel = new Spel();
		spel.startSpel();
		
	}
	public void  startSpel() {
		
	
		
	
		stapel = spelDeck.createDeck(); 
		spelDeck.shuffleDeck(stapel);
		stapel.get(0);
		pile.add(stapel.get(0));
		stapel.remove(0); 
		kaartenDelen();
		spelerEen.handBekijken();  
		
	}
	
	
	public void kaartenDelen() {
		
		for (int a = 0; a < 5; a++) {
			spelerEen.hand.add(stapel.get(0)); 
			spelerTwee.hand.add(stapel.get(1));
			stapel.remove(0);
			stapel.remove(1); 
		}
		
	}
	
	public void neemKaart(Spelers speler) {
	speler.hand.add(stapel.get(0));
	stapel.remove(0); 
	}
	public void kaartLeggen() {}
	

	
	

}
