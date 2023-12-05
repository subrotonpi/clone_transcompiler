public static void input ( Scanner in ) {
  int N = in . nextInt ( ) , K = in . nextInt ( ) ;
  ArrayList < Integer > S = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > T = new ArrayList < Integer > ( ) ;
  for ( int x = 1 ;
  x <= ( int ) ( N * .5 ) ;
  x ++ ) {
    if ( N % x == 0 ) {
      S . add ( x ) ;
      if ( x * x < N ) T . add ( N / x ) ;
    }
  }
  Collections . reverse ( T ) ;
  S . addAll ( T ) ;
  int M = S . size ( ) ;
  int [ ] U = new int [ M ] ;
  int MOD = 10 * 9 + 7 ;
  int ans = 0 ;
  int v = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = S . get ( i ) ;
    v = Math . pow ( K , ( x + 1 ) / 2 , MOD ) ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      int y = S . get ( j ) ;
      if ( x % y == 0 ) v -= U [ j ] ;
    }
    U [ i ] = v % MOD ;
    ans = ( ans + ( x & 1 ? v * x : v * ( x / 2 ) ) ) % MOD ;
  }
  System . out . println ( ans ) ;
}
