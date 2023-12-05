static final class Memoize extends Callable < Double > callable ( final Callable < ? extends Double > function ) {
  private final Memoize cache ;
  {
    cache = new Memoize ( ) {
      final Callable < Double > callable = function ;
      @ Override public Double call ( ) throws Exception {
        return function . call ( ) ;
      }
    }
    ;
  }
  int count = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i : xrange ( count ) ) {
    final double v = doTrial ( in ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + v ) ;
  }
  @ Override public Double call ( ) throws Exception {
    return callable . call ( ) ;
  }
  private double key = callable . call ( ) ;
  @ Override public double call ( ) throws Exception {
    return callable . call ( ) ;
  }
  @ Override public double fact ( final int N ) {
    if ( N < 2 ) return 1 ;
    return N * fact ( N - 1 ) ;
  }
  @ Override public double invFact ( final int N ) {
    if ( N < 0 ) return 0 ;
    return 1.0 / fact ( N ) ;
  }
  @ Override public double [ ] expectedProbabilities ( final int C , final int N , final double [ ] probs ) throws Exception {
    final double [ ] newProbabilities = new double [ probs . length ] ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      final double oldProb = probs [ i ] ;
      for ( int c = xrange ( 0 , C - i + 1 ) ;
      c <= N ;
      ++ c ) {
        final double p = prob ( C - i , i , c , N - c ) ;
        newProbabilities [ i + c ] += oldProb * prob ( C - i , i , c , N - c ) ;
      }
    }
    return newProbabilities ;
  }
  @ Override public double choose ( final int a , final int b ) {
    return fact ( a ) / fact ( b ) / fact ( a - b ) ;
  }
  @ Override public double prob ( final int K0 , final int K1 , final int P0 , final int P1 ) {
    final double P = 1.0 * fact ( K0 + K1 - P0 - P1 ) * invFact ( K0 + K1 ) * fact ( K0 ) * invFact ( K0 - P0 ) * fact ( K1 ) * invFact ( K1 - P1 ) * choose ( P0 + P1 , P0 ) ;
    return P ;
  }
}
