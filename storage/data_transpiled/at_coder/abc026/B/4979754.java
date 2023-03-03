static final double S ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( r ) ;
  double S = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) S += r [ i ] * r [ i ] ;
    else S -= r [ i ] * r [ i ] ;
  }
  System . out . println ( S * Math . PI ) ;
  return S ;
}
