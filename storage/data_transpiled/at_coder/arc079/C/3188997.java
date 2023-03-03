public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int cnt = 0 ;
  boolean f = true ;
  while ( f ) {
    f = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] >= N - cnt ) {
        int q = A [ i ] + cnt + 1 ;
        int m = A [ i ] + N + 1 ;
        A [ i ] = m - cnt - 1 ;
        cnt += q ;
        f = true ;
      }
    }
  }
  System . out . println ( cnt ) ;
}
