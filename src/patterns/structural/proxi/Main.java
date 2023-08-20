package patterns.structural.proxi;

import patterns.structural.proxi.image.Image;
import patterns.structural.proxi.image.ProxyImage;

// Пример использования
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // Изображение будет загружено только при вызове метода display()
        image.display();

        // Изображение не будет загружено снова, так как оно уже находится в памяти
        image.display();
    }
}
