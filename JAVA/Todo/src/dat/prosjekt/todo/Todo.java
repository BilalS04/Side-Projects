package dat.prosjekt.todo;

public class Todo {
	
	private String todo;
	
	public Todo(String todo) {
		this.todo = todo;
	}
	
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	public String toString() {
		return todo;
	}
}
