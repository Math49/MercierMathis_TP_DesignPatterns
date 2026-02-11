package Decorator.src;

public class GardenOption extends ContractDecorator {

    public GardenOption(ContractDocument wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        return super.getText() + "Option: Logement avec jardin\n";
    }

    @Override
    public int getMonthlyPrice() {
        return super.getMonthlyPrice() + 100;
    }
}
