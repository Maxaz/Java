package AbstractClass.exercise;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (this.getValue() instanceof Comparable && listItem.getValue() instanceof Comparable){
            return ((Comparable<Object>) this.getValue()).compareTo((Comparable<Object>) listItem.getValue());
        }
        return -1;
    }

}
