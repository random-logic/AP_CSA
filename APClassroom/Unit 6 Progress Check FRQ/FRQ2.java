public class FRQ2 {
  private int[] itemsSold;
  private double[] wages;

  public double computeBonusThreshold() {
    int least = itemsSold[0], most = itemsSold[0];
    int sum = 0;
    for (int amt : itemsSold) {
      sum += amt;
      if (amt < least)
        least = amt;
      else if (amt > most)
        most = amt;
    }
    sum -= least;
    sum -= most;
    return ((double)sum) / itemsSold.length;
  }

  public void computeWages(double fixedWage, double perItemWage) {
    double bonusThreshold = computeBonusThreshold();
    for (int i = 0; i < wages.length; i++) {
      wages[i] = fixedWage + perItemWage * itemsSold[i];
      if (itemsSold[i] > bonusThreshold)
        wages[i] *= 1.1;
    }
  }
}