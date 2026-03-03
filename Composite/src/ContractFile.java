package Composite.src;

public class ContractFile implements DocumentItem {

    private final String name;
    private final int pages;

    public ContractFile(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + pages + " pages)");
    }

    @Override
    public int getTotalPages() {
        return pages;
    }
}
