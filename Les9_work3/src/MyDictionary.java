/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary.
 * Реалізуйте у найпростішому наближенні можливість використання його екземпляра.
 * Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод
 * додавання пар елементів, індексатор для отримання значення елемента за вказаним
 * індексом і властивість тільки для читання для отримання загальної кількості
 * пар елементів.*/

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<K, T> {
    Map<K, T> dictionary = new HashMap<>();

    public void add(K key, T value) {
        dictionary.put(key, value);
    }

    public T indexOfValue(K key) {
        return dictionary.get(key);
    }

    public int size() {
        return dictionary.size();
    }

    public Map<K, T> genDictionary() {
        return dictionary;
    }
}
