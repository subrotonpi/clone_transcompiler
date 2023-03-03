public static int N ( ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = i ;
  }
  int countSum = 0 ;
  for ( int i : a ) {
    while ( i % 2 == 0 ) {
      i = i / 2 ;
      countSum ++ ;
    }
  }
  return countSum ;
}
