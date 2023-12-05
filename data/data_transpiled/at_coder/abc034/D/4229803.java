public static void f ( int x ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = w [ i ] * p [ i ] - w [ i ] * x ;
  }
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  int s = Arrays . binarySearch ( a , 0 , K ) ;
  return s >= 0 ? Arrays . binarySearch ( a , 0 , K ) : 0 ;
}
