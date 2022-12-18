public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.add(1, "Ukraine");
        myDictionary.add(2, "yellow");
        myDictionary.add(3, "blue");
        myDictionary.add(4, "Kyiv");

        System.out.println(myDictionary.genDictionary());
        System.out.println(myDictionary.size());
        System.out.println(myDictionary.indexOfValue(2));
    }
}