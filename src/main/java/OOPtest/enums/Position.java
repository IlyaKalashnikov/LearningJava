package OOPtest.enums;

public enum Position {
    JUNIOR("Джуниор"),
    MIDDLE("Мидл разработчик"),
    SENIOR("Синьер разработчик"),
    LEAD("Лид разработчик");

    private String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
