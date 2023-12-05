private static double generateRandom ( @ Nonnull int N , @ Nonnull int K ) {
  double res = 0 ;
  res += ( K - 1 ) * 1 * ( N - K ) * 6 ;
  res += 1 * 1 * ( N - K ) * 3 ;
  res += ( K - 1 ) * 1 * 1 * 3 ;
  res += 1 * 1 * 1 * 1 ;
  return res / ( N * N * N ) ;
}
