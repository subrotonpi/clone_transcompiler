static final int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  Arrays . sort ( a ) ;
  int [ ] s = new int [ N ] ;
  Arrays . sort ( s ) ;
  boolean b = ( s <= x ) ;
  if ( b ) {
    if ( s [ s . length - 1 ] == x ) {
      c ++ ;
    }
    else {
    }
  }
  return s ;
}
