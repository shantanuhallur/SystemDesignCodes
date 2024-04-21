class Test {
    public static void main(String[] args) {
        Editor e = new Editor();
        CareTaker ct = new CareTaker();

        e.text = "hello";
        e.cursorX = 10;
        e.cursorY = 20;
        e.ff = "Devanagari";
        e.fs = 5;
        
        EditorMemento em1 = e.getSnapshot(); //*Returns object of editorMemento through Editor.
        ct.save(em1);
        e.print();

        e.text += "World ";
        e.cursorX = 30;
        e.print();

        EditorMemento em2 = e.getSnapshot();
        ct.save(em2);

        e.fs = 25;
        e.ff = "Comic Sans MS";
        e.print();

        EditorMemento em3 = e.getSnapshot();
        ct.save(em3);

        e.text += " ,hope all is well";
        e.print();

        e.restore(ct.undo());
        e.print();
        e.restore(ct.undo());
        e.print();
        e.restore(ct.undo());
        e.print();
    }
}