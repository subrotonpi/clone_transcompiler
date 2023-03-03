public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( N - M ) >= 2 ) {
    System . out . println ( 0 ) ;
  }
  else if ( N == M ) {
    int ans = 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      ans = ( ans * i ) % ( 10 * 9 + 7 ) ;
    }
    for ( int i = 1 ;
    i <= M ;
    i ++ ) {
      ans = ( ans * i ) % ( 10 * 9 + 7 ) ;
    }
    System . out . println ( ( 2 * ans ) % ( 10 * 9 + 7 ) ) ;
  }
  else {
    int ans = 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      ans = ( ans * i ) % ( 10 * 9 + 7 ) ;
    }
    for ( int i = 1 ;
    i <= M ;
    i ++ ) {
      ans = ( ans * i ) % ( 10 * 9 + 7 ) ;
    }
    System . out . println ( ans % ( 10 * 9 + 7 ) ) ;
  }
  return ans ;
}
