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

    public static SuperArray zip(SuperArray a, SuperArray b) {
        String[] data1 = a.toArray();
        String[] data2 = b.toArray();
        SuperArray result = new SuperArray();

        int shorter = data1.length < data2.length ? data1.length : data2.length;
        for (int i = 0; i < shorter; i++) {
            result.add(data1[i]);
            result.add(data2[i]);
        }

        if (data1.length < data2.length) {
            for (int i = shorter; i < data2.length; i++) {
                result.add(data2[i]);
            }
        } else if (data1.length > data2.length) {
            for (int i = shorter; i < data1.length; i++) {
                result.add(data1[i]);
            }
        }

        System.out.println(result.size());
        return result;
    }


    public static void main(String[] args) {
        SuperArray a = new SuperArray();

//        System.out.println(a.isEmpty());

        a.add("a");     a.add("b");     a.add("c");     a.add("d");
        a.add("e");     a.add("f");     a.add("g");     a.add("h");
        a.add("i");     a.add("j");

//        System.out.println(a.isEmpty());
//        System.out.println(a.size());
//        System.out.println(a.get(9));
//        System.out.println(a.set(9, "asdf"));
//        System.out.println(a.get(9));
//
//        a.add("k");
//        System.out.println(a.size());
//        System.out.println(a.get(10));
//
//        System.out.println(a.toString());
//        System.out.println(a.contains("d"));
//
//        a.add(5, "qwerty");
//        System.out.println(a.toString());
//        System.out.println(a.size());
//
//        a.remove(5);
//        System.out.println(a.toString());
//        System.out.println(a.size());
//
//        System.out.println(a.indexOf("dd"));


        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro");
//
//        System.out.println(words);
//        removeDuplicates(words);
//        System.out.println(words);

        SuperArray test1 = new SuperArray();
        SuperArray test2 = new SuperArray();
        test1.add("9");     test1.add("1");     test1.add("2");     test1.add("2");     test1.add("3");     test1.add("4");
        test2.add("0");     test2.add("4");     test2.add("2");     test2.add("2");     test2.add("9");
//        System.out.println(findOverlap( test1, test2 ));

//        System.out.println(test1.lastIndexOf("2"));

        SuperArray equals1 = new SuperArray();
        SuperArray equals2 = new SuperArray();

        equals1.add("0");     equals1.add("4");     equals1.add("2");     equals1.add("2");     equals1.add("9");
        equals2.add("0");     equals2.add("4");     equals2.add("2");     equals2.add("2");     equals2.add("9");
//
//        System.out.println(equals1.equals(equals2));
//
//        System.out.println(zip(test1, test2));


        try {
            SuperArray error1 = new SuperArray(-3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(equals1.get(6));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(equals1.set(-4, "test"));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}