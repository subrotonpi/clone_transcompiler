public static int N ( int x ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  Arrays . sort ( a ) ;
  int counter = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int n = a [ i ] ;
    x -= n ;
    if ( x >= 0 && i != N - 1 ) counter ++ ;
    else if ( x == 0 ) {
      counter ++ ;
      break ;
    }
    else break ;
  }
  System . out . println ( counter ) ;
  return counter ;
}
