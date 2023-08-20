package patterns.structural.composite.components;

import java.util.ArrayList;
import java.util.List;

// Промежуточный узел, который может содержать другие элементы
public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Действие в промежуточном узле");

        // Вызов действия для всех содержащихся элементов
        for (Component component : components) {
            component.operation();
        }
    }
}
