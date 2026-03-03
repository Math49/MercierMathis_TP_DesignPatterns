package Composite.src;

import java.util.ArrayList;
import java.util.List;

public class ContractFolder implements DocumentItem {

    private final String name;
    private final List<DocumentItem> children = new ArrayList<>();

    public ContractFolder(String name) {
        this.name = name;
    }

    public void add(DocumentItem item) {
        children.add(item);
    }

    public void remove(DocumentItem item) {
        children.remove(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + name);
        for (DocumentItem child : children) {
            child.print(indent + "  ");
        }
    }

    @Override
    public int getTotalPages() {
        int sum = 0;
        for (DocumentItem child : children) {
            sum += child.getTotalPages();
        }
        return sum;
    }
}
