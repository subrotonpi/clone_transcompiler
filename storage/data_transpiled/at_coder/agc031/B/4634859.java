static final void print ( ) {
  String nextLine = System . console ( ) . readLine ( ) ;
  int N = Integer . parseInt ( nextLine ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] last = new int [ 3 * 10 * 5 ] ;
  int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int c = Integer . parseInt ( nextLine ) ;
    if ( last [ c ] != - 1 && last [ c ] + 1 < i ) {
      dp [ i ] = ( dp [ last [ c ] ] + dp [ i - 1 ] ) % MOD ;
    }
    else {
      dp [ i ] = dp [ i - 1 ] ;
    }
    last [ c ] = i ;
  }
  System . out . println ( dp [ N ] ) ;
}
