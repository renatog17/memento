package memento;

public class EditorMemento {

	private final String content;

	public EditorMemento(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
        return content;
    }
}
