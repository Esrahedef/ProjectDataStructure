public interface MinHeapInterface<T extends Comparable<? super T>> {
    void add(T newEntry);
    T removeMin();
    T getMin();
    boolean isEmpty();
    int getSize();
    void clear();
}

