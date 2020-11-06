public class Driver {

    public static void removeDuplicates(SuperArray s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.indexOf(s.get(i)) != i) {
                s.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        SuperArray a = new SuperArray();

        System.out.println(a.isEmpty());

        a.add("a");     a.add("b");     a.add("c");     a.add("d");
        a.add("e");     a.add("f");     a.add("g");     a.add("h");
        a.add("i");     a.add("j");

        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.get(9));
        System.out.println(a.set(9, "asdf"));
        System.out.println(a.get(9));

        a.add("k");
        System.out.println(a.size());
        System.out.println(a.get(10));

        System.out.println(a.toString());
        System.out.println(a.contains("d"));

        a.add(5, "qwerty");
        System.out.println(a.toString());
        System.out.println(a.size());

        a.remove(5);
        System.out.println(a.toString());
        System.out.println(a.size());

        System.out.println(a.indexOf("dd"));


        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro");

        System.out.println(words);
        removeDuplicates(words);
        System.out.println(words);

    }
}