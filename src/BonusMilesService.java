public class BonusMilesService {
    public int calculate(int cost) {
        int priceOfMile = 20;
        int bonusMiles = cost / priceOfMile;
        return bonusMiles;
    }
}
