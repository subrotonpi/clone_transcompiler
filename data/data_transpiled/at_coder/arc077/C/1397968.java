static final int m = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int i , j , k ;
  int S = 0 ;
  int l = 3 * m ;
  int [ ] D = new int [ l ] ;
  for ( i = 0 ;
  i < l ;
  i ++ ) {
    a = i ;
    b = i ;
    b += m * ( b < a ) ;
    k = b - a ;
    S += k ;
    if ( k > 1 ) D [ a + 2 ] ++ ;
  }
  return S ;
}
