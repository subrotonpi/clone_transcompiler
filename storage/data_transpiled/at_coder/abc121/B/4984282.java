public static int [ ] getMatrix ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int goukei = 0 ;
    int [ ] a = Integer . parseInt ( input ) ;
    a = new int [ n ] ;
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      goukei += a [ j ] * b [ j ] ;
    }
    if ( goukei + c > 0 ) {
      kazu ++ ;
    }
  }
  return b ;
}
