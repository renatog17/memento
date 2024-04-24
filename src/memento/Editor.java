package memento;

public class Editor {

	private String content;
	
	public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    
    public EditorMemento save() {
    	return new EditorMemento(this.content);
    }
    
    public void restore(EditorMemento editorMemento) {
    	this.content = editorMemento.getContent();
    }
	
}
