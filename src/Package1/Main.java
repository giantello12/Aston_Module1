package Package1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<Integer> exampleList = new ArrayList<>();
        Collections.addAll(exampleList, 1, 2, 3, 4);
        int exampleInteger = 10;

        ImmutableClass ic = new ImmutableClass(exampleInteger, exampleList);

        System.out.println("Поля перед изменением исходного списка в Main.");
        printImmutableClassFields(ic);

        exampleList.add(12);
        List<Integer> exampleList2 = ic.getExampleListField();
        try {
            exampleList2.add(12);
        } catch (UnsupportedOperationException e) {
            System.out.println("\nПопытка изменить неизменяемый список\n" + e);
        }

        System.out.println("\nПоля после изменения исходного списка в Main.");
        printImmutableClassFields(ic);
        System.out.println("\nПосле изменения исходного списка поле класса exampleListField сохраняет значение");
    }

    private static void printImmutableClassFields(ImmutableClass ic) {
        System.out.println("Поля ImmutableClass:\n" +
                "   exampleIntegerField: " + ic.getExampleIntegerField() + "\n" +
                "   exampleListField: " + ic.getExampleListField());
    }
}
