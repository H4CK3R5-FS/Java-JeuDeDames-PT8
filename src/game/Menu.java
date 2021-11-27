package game;

import utilitaires.Utilitaires;

public class Menu {
public static int menu_Size() {
	System.out.println(Texts.size_Choice);
	String choice = Utilitaires.saisieString();
	switch (choice) {
	case "1":return 10;
	case "2" : return 12;
	case "3" : return 14;
	default : System.out.println("choix invalide alors la taille sera 8*8");
	}
	return 10;
}
}
