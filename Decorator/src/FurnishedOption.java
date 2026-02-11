package Decorator.src;

public class FurnishedOption extends ContractDecorator {

    public FurnishedOption(ContractDocument wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        return super.getText() + "Option: Logement meublé\n";
    }

    @Override
    public int getMonthlyPrice() {
        return super.getMonthlyPrice() + 80;
    }
}
