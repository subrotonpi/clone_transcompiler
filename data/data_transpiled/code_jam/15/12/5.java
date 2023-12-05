public static int tests = Integer . parseInt ( input ) {
  int [ ] b = new int [ input . length ] ;
  int n = input . length ;
  int [ ] a = new int [ input . length ] ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    b [ i ] = b [ i ] ;
    n = input . length ;
  }
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    b [ i ] = b [ i ] ;
    n = input . length ;
  }
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = a [ i ] ;
  }
  while ( left + 1 < right ) {
    int c = ( left + right ) / 2 ;
    int started = 0 ;
    for ( int bi : a ) {
      started += c / bi + 1 ;
    }
    if ( started < n ) {
      left = c ;
    }
    else {
      right = c ;
    }
  }
  started = 0 ;
  for ( int bi : a ) {
    started += left / bi + 1 ;
  }
  int startedBefore = started ;
  int [ ] now = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( ( left + 1 ) % bi == 0 ) {
      started ++ ;
      now [ i ] = i + 1 ;
    }
  }
  return now [ n - 1 - startedBefore ] ;
}
