static final double sqrt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( c ) ;
  double tmp = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) tmp += c [ i ] * c [ i ] ;
    else tmp -= c [ i ] * c [ i ] ;
  }
  System . out . println ( tmp * Math . PI ) ;
  return tmp ;
}
