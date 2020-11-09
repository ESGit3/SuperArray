public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity) {
        data = new String[initialCapacity];
        size = 0;
    }

    private void resize() {
        String[] temp = new String[data.length + 1];
        int pos = 0;
        for (String i : data) {
            temp[pos] = i;
            pos++;
        }
        data = temp;
    }

    public int size() {
        return size;
    }

    public boolean add(String element) {
        if (size >= data.length) {
            this.resize();
        }
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

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public void clear() {
        this.size = 0;
        this.data = new String[10];
    }

    public String toString() {
        String temp = "[";
        for (int i = 0; i < this.size; i++) {
            temp += this.data[i] + ", ";
        }
        temp = temp.substring(0, temp.length() - 2);
        temp += "]";

        return temp;
    }

    public boolean contains(String s) {
        for (int i = 0; i < this.size; i++) {
            if ((this.data)[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void add(int index, String element) {
        this.resize();
        for (int i = this.size; i > index - 1; i--) {
            (this.data)[i] = (this.data)[i - 1];
        }
        (this.data)[index] = element;
        this.size += 1;
    }

    public void remove(int index) {
        if (this.size != 0) {
            for (int i = index; i < this.size - 1; i++) {
                (this.data)[i] = (this.data)[i + 1];
            }
            this.data[this.size - 1] = null;
            this.size -= 1;
        }
    }

    public int indexOf(String s) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public String[] toArray() {
        return this.data;
    }

    public int lastIndexOf(String s) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.data[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(SuperArray other) {
        if (this.size == other.size()) {
            for (int i = 0; i < this.size; i++) {
                if (this.data[i] == other.data[i]) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}