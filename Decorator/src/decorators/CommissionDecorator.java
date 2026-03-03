package Decorator.src.decorators;

import Decorator.src.component.CommissionCalculator;

public abstract class CommissionDecorator implements CommissionCalculator {

    protected final CommissionCalculator inner;

    protected CommissionDecorator(CommissionCalculator inner) {
        this.inner = inner;
    }
}