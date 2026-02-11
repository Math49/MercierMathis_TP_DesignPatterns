package AbstractFactoryMethod.src.Product;

public class FranceClause implements LegalClause {

    @Override
    public String getClauseText() {
        return "Clause conforme au Code Civil français.";
    }
}