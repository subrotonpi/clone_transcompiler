static final double pi ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  double pi = Math . PI ;
  Arrays . sort ( r , Collections . reverseOrder ( ) ) ;
  double R = 0 ;
  for ( int i = 0 ;
  i < r . length ;
  i ++ ) {
    if ( r [ i ] % 2 == 0 ) R += r [ i ] * r [ i ] ;
    else R -= r [ i ] * r [ i ] ;
  }
  return R * pi ;
}
