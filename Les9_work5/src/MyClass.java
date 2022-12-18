/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass,
 * що містить статичний фабричний метод - T factoryMethod(),
 * який породжуватиме екземпляри типу, зазначеного як параметр типу
 * (покажчика місця заповнення типом – Т).*/

public class MyClass<T> {
    public T field;

    public MyClass() {
    }

    public MyClass(T field) {
        this.field = field;
    }

    public static <T> MyClass<T> factoryMethod() {
        return new MyClass<>();
    }

    public static <T> MyClass<T> factoryMethod(T value) {
        return new MyClass<>(value);
    }
}