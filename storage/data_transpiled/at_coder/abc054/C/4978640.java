static final int [ ] [ ] getMatchingPatterns ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] line = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    line [ a - 1 ] [ b - 1 ] = 1 ;
    line [ b - 1 ] [ a - 1 ] = 1 ;
  }
  int ans = 0 ;
  int [ ] p = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    p [ i ] = i ;
  }
  for ( int x : new int [ n ] ) {
    x = p [ 0 ] ;
    x . add ( 0 , 0 ) ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( line [ x [ i ] ] [ x [ i + 1 ] ] == 0 ) break ;
      if ( i == n - 2 ) ans ++ ;
    }
  }
  return line ;
}
