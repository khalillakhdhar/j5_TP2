package data;

public class Rappel {
private String titre,date,description;

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Rappel(String titre, String date, String description) {
	super();
	this.titre = titre;
	this.date = date;
	this.description = description;
}

public Rappel() {
	super();
}



}
