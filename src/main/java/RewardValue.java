public class RewardValue {
    private final double cash;

    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles) {
        this.cash = convertMilesValue(miles);
    }


    public int convertCashValue(double cash) {
        return (int) (cash / 0.0035); 
    }

    public double convertMilesValue(int miles) {
        return miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return convertCashValue(this.cash);
    }
}
