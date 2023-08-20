package patterns.structural.composite;

import patterns.structural.composite.components.Composite;
import patterns.structural.composite.components.Leaf;

// Пример использования паттерна Composite
    public class Main {
        public static void main(String[] args) {
            // Создание структуры дерева
            Composite root = new Composite();
            Composite node1 = new Composite();
            Composite node2 = new Composite();

            Leaf leaf1 = new Leaf();
            Leaf leaf2 = new Leaf();
            Leaf leaf3 = new Leaf();
            Leaf leaf4 = new Leaf();

            root.add(node1);
            root.add(node2);
            node1.add(leaf1);
            node1.add(leaf2);
            node2.add(leaf3);
            node2.add(leaf4);

            // Выполнение действий на всей структуре дерева
            root.operation();
        }
    }
