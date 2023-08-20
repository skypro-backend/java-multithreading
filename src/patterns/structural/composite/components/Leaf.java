package patterns.structural.composite.components;

// Листовой элемент, который не может содержать другие элементы
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Действие в листовом элементе");
    }
}
