public class Driver {

    public static void removeDuplicates(SuperArray s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.indexOf(s.get(i)) != i) {
                s.remove(i);
                i--;
            }
        }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
        SuperArray temp = new SuperArray();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) {
                temp.add(a.get(i));
            }
        }
        removeDuplicates(temp);
        return temp;
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

        SuperArray test1 = new SuperArray();
        SuperArray test2 = new SuperArray();
        test1.add("9");     test1.add("1");     test1.add("2");     test1.add("2");     test1.add("3");     test1.add("4");
        test2.add("0");     test2.add("4");     test2.add("2");     test2.add("2");     test2.add("9");
        System.out.println(findOverlap( test1, test2 ));
    }
}