/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList.
 * Реалізуйте у найпростішому наближенні можливість використання його екземпляра
 * аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з
 * екземпляром повинен включати метод додавання елемента, індексатор для отримання
 * значення елемента за вказаним індексом і властивість тільки для читання для отримання
 * загальної кількості елементів.*/

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> arr = new ArrayList<>();

    public void add(T val) {
        arr.add(val);
    }

    public T get(int index) {
        if (index >= 0 || index < size())
            return arr.get(index);
        else throw new IndexOutOfBoundsException("Індекс недопустимий");
    }

    public int size() {
        return arr.size();
    }

    public List<T> getArr() {
        return arr;
    }
}