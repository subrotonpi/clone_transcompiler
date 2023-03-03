public static int dMultiLoop ( int N , int K ) {
  class Combination implements CombinationCombination {
    int n , mod ;
    int [ ] factorial ;
    int [ ] factInv ;
    {
      this . mod = mod ;
      factorial = new int [ n + 1 ] ;
      for ( int k = 1 ;
      k < n ;
      k ++ ) {
        factorial [ k + 1 ] = ( factorial [ k ] * ( k + 1 ) ) % mod ;
      }
      factInv = new int [ n + 1 ] ;
      factInv [ n ] = Math . pow ( factorial [ n ] , mod - 2 , mod ) ;
      for ( int k = 1 ;
      k < n + 1 ;
      k ++ ) {
        factInv [ k - 1 ] = ( factInv [ k ] * k ) % mod ;
      }
    }
    int comb ;
    int n , r ;
    int n ;
    int r ;
    int r ;
    int n ;
    int r ;
    int r ;
    int ans ;
    n = ( int ) ( input . nextInt ( ) ) ;
    K = ( int ) ( input . nextInt ( ) ) ;
    System . out . println ( dMultiLoop ( N , K ) ) ;
  }
}
