public static void memoized ( Runnable runnable ) {
  Map < Integer , Runnable > mem = new HashMap < Integer , Runnable > ( ) ;
  Runnable r = ( ) -> {
    if ( ! mem . containsKey ( r ) ) {
      mem . put ( r , runnable ) ;
    }
    return mem . get ( r ) ;
  }
  ;
  String TASK = "C" ;
  System . out . println ( "Precalculation..." ) ;
  final int [ ] primes = new int [ 10 * 6 + 1 ] ;
  for ( int i : xrange ( 2 , 10 * 6 + 1 ) ) {
    if ( isprime ( i , primes ) ) {
      primes [ i ] = i ;
    }
  }
  System . out . println ( "Precalculation done." ) ;
  System . out . println ( "Calculation..." ) ;
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( TASK + ".in" ) ) ;
    PrintWriter out = new PrintWriter ( TASK + ".out" , true ) ;
    int cases = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int ncase = 0 ;
    ncase < cases ;
    ncase ++ ) {
      int N = Integer . parseInt ( in . readLine ( ) ) ;
      double s = Math . sqrt ( N ) ;
      int ans = 0 ;
      for ( int p : primes ) {
        if ( p > s ) break ;
        ans += ( int ) Math . log ( N , p ) - 1 ;
      }
      if ( N > 1 ) ans ++ ;
      out . println ( "Case #" + ( ncase + 1 ) + ": " + ans ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
}
