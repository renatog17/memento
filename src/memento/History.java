package memento;

import java.util.ArrayList;
import java.util.List;


public class History {

	private final List<EditorMemento> mementos = new ArrayList<>();
	
	public void add(EditorMemento editorMemento) {
		this.mementos.add(editorMemento);
	}
	
	public EditorMemento get(Integer index) {
		return mementos.get(index);
	}
}
