static final String getline ( ) {
  final String line ;
  /* Enter the line of the line to print out */
  char [ ] [ ] nextLine = line . toCharArray ( ) ;
  /* Enter the line of the line to print out */
  int n = Integer . parseInt ( nextLine [ 0 ] ) ;
  int m = Integer . parseInt ( nextLine [ 1 ] ) ;
  char [ ] [ ] board = new char [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    board [ i ] = nextLine [ i ] ;
  }
  for ( int i = Math . min ( n , m ) ;
  i >= 2 ;
  i -- ) {
    for ( int j = 0 ;
    j < n - i + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < m - i + 1 ;
      k ++ ) {
        int x = 0 ;
        int y = 0 ;
        int cx = j + j + i - 1 ;
        int cy = k + k + i - 1 ;
        for ( int s = j ;
        s <= j + i ;
        s ++ ) {
          boolean borderx = ( s == j ) || ( s == j + i - 1 ) ;
          for ( int t = k ;
          t <= k + i ;
          t ++ ) {
            boolean bordery = ( t == k ) || ( t == k + i - 1 ) ;
            if ( borderx && bordery ) continue ;
            x += ( int ) board [ s ] [ t ] * ( s + s - cx ) ;
            y += ( int ) board [ s ] [ t ] * ( t + t - cy ) ;
          }
        }
        if ( x == 0 && y == 0 ) {
          /* Return the result of the line */
          return "IMPOSSIBLE" ;
        }
      }
    }
  }
  /* Return the result of the line of the line */
  int t = Integer . parseInt ( nextLine ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + testcase ( i ) ) ;
  }
  return "IMPOSSIBLE" ;
}
