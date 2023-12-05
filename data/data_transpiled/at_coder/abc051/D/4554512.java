private static int [ ] [ ] map ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] d = new int [ n ] [ 18 ] ;
  int [ ] [ ] e = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    d [ a - 1 ] [ b - 1 ] = c ;
    d [ b - 1 ] [ a - 1 ] = c ;
    e [ i ] = a ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  return e ;
}
