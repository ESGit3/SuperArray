public class Driver {
    public static void main(String[] args) {
        SuperArray a = new SuperArray();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("f");
        a.add("g");
        a.add("h");
        a.add("i");
        a.add("j");

        System.out.println(a.size());
        System.out.println(a.get(9));
        System.out.println(a.set(9, "asdf"));
        System.out.println(a.get(9));

        a.add("k");
        System.out.println(a.size());
        System.out.println(a.get(10));

        SuperArray words = new SuperArray();
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for(int i = 0; i < words.size(); i++){
            System.out.println( words.get(i) );
        }
    }
}