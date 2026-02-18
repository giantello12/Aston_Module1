package Package1;

import java.util.List;

public final class ImmutableClass {
    private final int exampleIntegerField;
    private final List<Integer> exampleListField; // Поле хранит ссылку на объект изменяемого класса

    public ImmutableClass(int exampleIntegerField, List<Integer> exampleListField) {
        this.exampleIntegerField = exampleIntegerField;
        this.exampleListField = List.copyOf(exampleListField);
    }

    public int getExampleIntegerField() {
        return exampleIntegerField;
    }

    public List<Integer> getExampleListField() {
        return List.copyOf(exampleListField);
    }
}
