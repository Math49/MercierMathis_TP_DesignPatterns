package Decorator.src;

public class ParkingOption extends ContractDecorator {

    public ParkingOption(ContractDocument wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        return super.getText() + "Option: Place de parking\n";
    }

    @Override
    public int getMonthlyPrice() {
        return super.getMonthlyPrice() + 50;
    }
}

