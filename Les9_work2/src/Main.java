public class Main {
    public static void main(String[] args) {
        MyList<String> arrayList = new MyList<>();
        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.add("lucky");
        arrayList.add("best");

        System.out.println(arrayList.getArr());
        System.out.println(arrayList.getArr().indexOf("lucky"));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
        System.out.println("-------------------");
        MyList<Integer> arrayList1 = new MyList<>();
        arrayList1.add(5);
        arrayList1.add(24);
        arrayList1.add(98);
        arrayList1.add(79);

        System.out.println(arrayList1.getArr());
        System.out.println(arrayList1.getArr().indexOf(98));
        System.out.println(arrayList1.get(3));
        System.out.println(arrayList1.size());
    }
}
