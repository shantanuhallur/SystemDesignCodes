import java.time.LocalDateTime;

public class EditorMemento {
    private String text;
    private int cursorX;
    private int cursorY;
    private int fs;
    private String ff;
    private LocalDateTime moment;
    
    EditorMemento(String text, int cursorX, int cursorY, int fs, String ff) {
        this.text = text;
        this.cursorX = cursorX;
        this.cursorY = cursorY;
        this.fs = fs;
        this.ff = ff;
        this.moment = LocalDateTime.now();
    }

    public String getText() {
        return this.text;
    }

    public int getcursorX() {
        return this.cursorX;
    }

    public int getcursorY() {
        return this.cursorY;
    }

    public int getfs() {
        return this.fs;
    }

    public String getff() {
        return this.ff;
    }
}
