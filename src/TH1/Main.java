package TH1;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("elements 4: " + listInteger.get(4));
        System.out.println("elements 3: " + listInteger.get(3));
        System.out.println("elements 2: " + listInteger.get(2));
        System.out.println("elements 1: " + listInteger.get(1));
    }
}
