package memento;

public class Main {

	public static void main(String[] args) {
		Editor editor = new Editor();
		History history = new History();
		
		editor.setContent("teste 1");
		history.add(editor.save());
		
		editor.setContent("teste 2");
		history.add(editor.save());
		
		editor.restore(history.get(1));
		
		System.out.println(editor.getContent());
	}
}
