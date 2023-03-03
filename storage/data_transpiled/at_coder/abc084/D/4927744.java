static final boolean [ ] getStdOut ( ) {
  boolean [ ] p = new boolean [ 10 * 10 * 5 + 1 ] ;
  p [ 0 ] = false ;
  p [ 1 ] = false ;
  int i = 2 ;
  while ( i * i <= 10 * 10 ) {
    if ( p [ i ] ) {
      int n = i * 2 ;
      while ( n <= 10 * 10 ) {
        p [ n ] = false ;
        n += i ;
      }
    }
    i ++ ;
  }
  int [ ] s = new int [ 10 * 10 * 5 + 2 ] ;
  for ( int i = 2 ;
  i <= 10 * 10 ;
  i ++ ) {
    s [ i ] = s [ i - 1 ] + ( ( p [ i - 1 ] && p [ i / 2 ] ) ? 1 : 0 ) ;
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ q ] ;
  int [ ] r = new int [ q ] ;
  for ( int i = 0 ;
  i <= q ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i <= q ;
  i ++ ) {
    System . out . println ( s [ r [ i ] + 1 ] - s [ l [ i ] ] ) ;
  }
  return s ;
}
