static final double [ ] S ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  double Z = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( x ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) Z += x [ i ] * x [ i ] ;
  }
  return x ;
}
