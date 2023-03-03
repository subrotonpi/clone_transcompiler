static final int m = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int i , k , A ;
  int S = 0 , l = 3 * m ;
  D = new int [ l ] ;
  for ( i = 0 , a = 0 ;
  i < l ;
  i ++ ) {
    a = A [ i ] ;
    b += m * ( b < a ) ;
    k = b - a ;
    S += k ;
    D [ a + 2 ] ++ ;
  }
  D [ a + 2 ] -= k ;
  return S ;
}
