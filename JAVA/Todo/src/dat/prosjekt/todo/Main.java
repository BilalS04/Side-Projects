package dat.prosjekt.todo;

public class Main {
	
	public static void main(String[] args) {
		
		
		// Lage todos-ene
		Todo todo1 = new Todo("Vaske bil");
		Todo todo2 = new Todo("Lekse");
		Todo todo3 = new Todo("Oppvask");
		Todo todo4 = new Todo("Trene");
		Todo todo5 = new Todo("Jobb");
		
		//Lage listen og legge inn todosene
		Todoliste todoliste = new Todoliste();
		todoliste.leggTil(todo1);
		todoliste.leggTil(todo2);
		todoliste.leggTil(todo3);
		todoliste.leggTil(todo4);
		todoliste.leggTil(todo5);
		
		//Oversikt over listen
		System.out.println(todoliste.toString());
		
		//Antall todos i listen
		System.out.println("I todolisten finnes det " + todoliste.antall() + " todos");
		
		//Endre todo1 til Vaske klær
		todoliste.oppdaterTodo(todo1, "Vaske klær");
		System.out.println(todoliste.toString());
		
		//Fjerne todo4
		todoliste.fjern(todo4);
		System.out.println(todoliste.toString());
		
		//Prøve å legge inn samme todo
		todoliste.leggTil(todo2);
		
		//Finnes todo4 i listen?
		System.out.println("Inneholder listen todo4: " + todoliste.inneholder(todo4));
	}
	
	
	

}
