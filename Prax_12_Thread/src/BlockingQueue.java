
interface BlockingQueue<E> {
    // lisab järjekorda uue sõnumi
    void put(E e) throws InterruptedException;
    // võtab järjekorrast järgmise sõnumi.
    // kui järjekord on tühi, siis ootab sõnumi saabumist.
    E take() throws InterruptedException;
    // võtab järjekorrast järgmise sõnumi.
    // kui järjekord on tühi, siis tagastab null.
    E poll();
}
