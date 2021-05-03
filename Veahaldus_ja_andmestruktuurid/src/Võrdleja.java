public class Võrdleja <T extends Comparable<T>>{

    private T one;


    public T leiaSuurem(T two) {
        T max = one;
        if (two.compareTo((max)) > 0) max = two;
        return max;
    }

    public T leiaSuurem(T one, T two) {
        T max = one;
        if (two.compareTo((max)) > 0) max = two;
        return max;
    }
}
