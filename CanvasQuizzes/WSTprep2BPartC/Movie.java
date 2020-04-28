public class Movie {
  private String features;

  public double likenessScore(Movie other) {
    int likeFeatures = 0, totalFeatures = features.length() / 3;
    for (int i = 0; i < features.length(); i += 3) {
      if (features.substring(i, i + 3).equals(other.features.substring(i, i + 3)))
        likeFeatures++;
    }
    return ((double) likeFeatures) / totalFeatures;
  }
}