static final int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  int [ ] s = new int [ n ] ;
  int [ ] f = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    c [ i ] = i ;
    s [ i ] = i ;
    f [ i ] = i ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    c [ i ] = i ;
    s [ i ] = i ;
    f [ i ] = i ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int t = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( t <= s [ j ] ) {
        t = s [ j ] + c [ j ] ;
      }
      else {
        t = Math . ceil ( t / f [ j ] ) * f [ j ] + c [ j ] ;
      }
    }
    System . out . println ( t ) ;
  }
  return c ;
}
