package Pesten;
public class Kaart {
private int card_id;
private int icon_id;
String card_name;
String icon_name;
private String full_name;
boolean isJoker;
public int getCard_id() {
	return card_id;
}
public void setCard_id(int card_id) {
	this.card_id = card_id;
	if(card_id == 11) { 
		card_name = "Boer";}
	else if(card_id == 12){card_name = "Koningin";}
	else if(card_id == 13){card_name = "Koning";}
	else if(card_id == 14){card_name = "Aas";}
}

public int getIcon_id() {
	return icon_id;
}
public String getIcon_name() {
	return icon_name;
}
public void setIcon_id(int icon_id) {
	this.icon_id = icon_id;
	if(icon_id == 0) { icon_name = "Harten";}
	else if(icon_id == 1){icon_name = "Ruiten";}
	else if(icon_id == 2){icon_name = "Schoppen";}
	else if(icon_id == 3){icon_name = "Klaveren";}
}

public String getFullCard_name() {
	if(card_id > 10) {
	full_name = icon_name + " " + card_name;
	}
	else {
		full_name = icon_name + " " + card_id;
	}
	return full_name;
}


}