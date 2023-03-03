public static int N = Integer . parseInt ( input ) {
  int count = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int [ ] a = new int [ i ] ;
    int allOdd = 0 ;
    for ( int j = 1 ;
    j <= i ;
    j ++ ) {
      if ( i % j == 0 ) {
        a [ j ] = 1 ;
      }
    }
    for ( int k : a ) {
      if ( k % 2 == 0 ) {
        allOdd ++ ;
      }
    }
    if ( allOdd == 0 && a . length == 8 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return count ;
}
