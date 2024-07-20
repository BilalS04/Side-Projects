package dat.prosjekt.todo;


public class Todoliste {

	private int antall;
	private Todo[] todos;
	
	public Todoliste() {
		todos = new Todo[10];
		antall = 0;
	}
	
	public void leggTil(Todo todo) {
		if(inneholder(todo)) {
			System.out.println("Error: Todo finnes allerede i listen!");
		} else {
			if(antall >= todos.length) {
				System.out.println("Listen er full");
			} else {
				todos[antall] = todo;
				antall++;
				System.out.println("Todo lagt inn!");
			}
		}
	}
	
	public void oppdaterTodo(Todo todo, String tekst) {
		if(inneholder(todo)) {
			for(int i = 0; i < antall; i++) {
				if(todos[i] == todo) {
					todos[i].setTodo(tekst);
				}
			}
			System.out.println("Todo oppdatert!");
		}
	}
	
	public void fjern(Todo todo) {
		if(inneholder(todo)) {
			int index = -1;
			
			for(int i = 0; i < antall; i++) {
				if(todos[i] == todo) {
					index = i;
				}
			}
			
			Todo temp = todos[antall-1];
			todos[index] = temp;
			antall--;
			System.out.println("Todo fjernet!");
			
		} else {
			System.out.println("Todo ble ikke fjernet!");
		}
	}
	
	public int antall() {
		return antall;
	}
	
	public boolean inneholder(Todo todo) {
		if(antall < 0) {
			return false;
		} else {
			boolean inneholder = false;
			for(int i = 0; i < antall; i++) {
				if(todos[i] == todo) {
					inneholder = true;
				}
			}
			return inneholder;
		}
	}
	
	public String toString() {
		String res = "";
		
		for(int i = 0; i < antall; i++) {
			res += "" + (i+1) + ". " + todos[i].toString() + "\n";
		}
		return res;
	}
}
