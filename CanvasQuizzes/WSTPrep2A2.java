class WSTPrep2A2 {
  private int[] samples;
  
  public int limitAmplitude(int limit) {
    int count = 0;
    for (int i = 0; i < samples.length; i++) {
      if (samples[i] > limit) {
        samples[i] = limit;
        count++;
      }
      else if (samples[i] < -limit) {
        samples[i] = -limit;
        count++;
      }
    }
    return count;
  }

  public void trimSilenceFromBeginning() {
    int firstNonSilent = 0;
    for (; firstNonSilent < samples.length; firstNonSilent++)
      if (samples[firstNonSilent] != 0) break;
    int[] newSamples = new int[samples.length - firstNonSilent];
    for (int i = 0; i < newSamples.length; i++) {
      newSamples[i] = samples[i + firstNonSilent];
    }
    samples = newSamples;
  }
}