package Decorator.src;

public abstract class ContractDecorator implements ContractDocument {

    protected final ContractDocument wrapped;

    protected ContractDecorator(ContractDocument wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getText() {
        return wrapped.getText();
    }

    @Override
    public int getMonthlyPrice() {
        return wrapped.getMonthlyPrice();
    }
}
