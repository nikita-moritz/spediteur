package spediteur.model.enums;

public enum Menu {
    ADD("1. Add Lieferung", 1),
    DEL("2. Delete Lieferung", 2),
    SHOW("3. Show all Lieferungen", 3),
    UPDATE("4. Update Lieferung", 4),
    FINISH("5. Finish", 5);

    private final String displayText;
    private final int id;

    Menu(String displayText, int id) {
        this.displayText = displayText;
        this.id = id;
    }

    public String getDisplayText() {
        return displayText;
    }

    public int getId() {
        return id;
    }
}
