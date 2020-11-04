public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public void resize() {
        String[] temp = new String[data.length + 1];
        int pos = 0;
        for (String i : data) {
            temp[pos] = i;
            pos++;
        }
    }

    public int size() {
        return size;
    }

    public boolean add(String element) {
        if (size >= data.length) return false;
        data[size] = element;
        size++;
        return true;
    }

    public String get(int index) {
        return (data[index]);
    }

    public String set(int index, String element) {
        String old = data[index];
        data[index] = element;
        return old;
    }
}