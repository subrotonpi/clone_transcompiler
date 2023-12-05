public static int change ( int p1 , int p2 , int p3 ) {
  int [ ] [ ] b = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] [ 0 ] = val [ i ] [ 0 ] * p1 ;
    b [ i ] [ 1 ] = val [ i ] [ 1 ] * p2 ;
    b [ i ] [ 2 ] = val [ i ] [ 2 ] * p3 ;
  }
  Arrays . sort ( b , 0 , M ) ;
  return Math . max ( Math . abs ( Math . pow ( b [ 0 ] [ 0 ] , M ) ) , Math . abs ( Math . pow ( b [ 0 ] [ 1 ] , M ) ) ) ;
}
