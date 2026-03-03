package Facade.src.services;

public class CommissionService {
    public double calculerCommission(double prixVente) {
        double commission = prixVente * 0.04;
        System.out.println("✅ Commission calculée : " + commission);
        return commission;
    }
}
