static final int m = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int i , k , A ;
  int S = 0 , l = 3 * m ;
  D = new int [ l ] ;
  for ( i = 0 ;
  i < l ;
  i ++ ) {
    A [ i ] = 0 ;
  }
  for ( a = 1 , b = 1 ;
  a < b ;
  a += m ) {
    b += m * ( b < a ) ;
    k = b - a ;
    S += k ;
    D [ a + 2 ] ++ ;
  }
  D [ a + 2 ] -= k ;
  for ( i = 0 ;
  i < l * 2 ;
  i ++ ) D [ i % l ] += k ;
  return S ;
}
