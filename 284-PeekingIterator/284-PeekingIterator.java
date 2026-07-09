// Last updated: 7/9/2026, 9:50:03 AM
class PeekingIterator implements Iterator<Integer> {
    Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {
        next=iterator.hasNext()?iterator.next():null;
        this.iterator=iterator;
    }

    Iterator<Integer> iterator;

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        Integer ans=next;
        next=iterator.hasNext()?iterator.next():null;
        return ans;
    }

    @Override
    public boolean hasNext() {
        return next!=null;
    }
}