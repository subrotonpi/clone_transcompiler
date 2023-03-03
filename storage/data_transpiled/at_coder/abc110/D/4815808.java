@ Function public static List < Integer > inpl ( ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = inpl ( ) ;
  final int M = inpl ( ) ;
  return ( List < Integer > factorize ( N ) ) -> {
    List < Integer > factorizeList = new ArrayList < > ( ) ;
    int i = 2 ;
    while ( i * i <= n ) {
      int k = 0 ;
      while ( n % i == 0 ) {
        n /= i ;
        k ++ ;
      }
      if ( k > 0 ) {
        factorizeList . add ( k ) ;
      }
      i ++ ;
    }
    if ( n > 1 ) {
      factorizeList . add ( 1 ) ;
    }
    return ( List ) factorizeList ;
  }
  ;
}
