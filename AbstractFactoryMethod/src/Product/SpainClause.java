package AbstractFactoryMethod.src.Product;

public class SpainClause implements LegalClause {

    @Override
    public String getClauseText() {
        return "Cláusula conforme al Código Civil español.";
    }
}