@ VisibleForTesting static void input ( Scanner scanner ) {
  int N = scanner . nextInt ( ) ;
  int [ ] x = new int [ N ] ;
  int [ ] y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = scanner . nextInt ( ) ;
    y [ i ] = scanner . nextInt ( ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        int x1 = x [ j ] - x [ i ] ;
        int y1 = y [ j ] - y [ i ] ;
        int x2 = x [ k ] - x [ i ] ;
        int y2 = y [ k ] - y [ i ] ;
        int s = Math . abs ( x1 * y2 - x2 * y1 ) ;
        if ( s > 0 && s % 2 == 0 ) {
          ans ++ ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
