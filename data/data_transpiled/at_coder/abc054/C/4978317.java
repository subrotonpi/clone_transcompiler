private static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  int [ ] [ ] line = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = in . nextInt ( ) , b = in . nextInt ( ) ;
    line [ a - 1 ] [ b - 1 ] = 1 ;
    line [ b - 1 ] [ a - 1 ] = 1 ;
  }
  Stack < Integer > stack = new Stack < > ( ) ;
  Stack < Integer > visited = new Stack < > ( ) ;
  visited . add ( new Integer ( 0 ) ) ;
  int ans = 0 ;
  while ( stack . size ( ) > 0 ) {
    int p = stack . pop ( ) ;
    Stack < Integer > v = visited . pop ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( line [ p ] [ i ] != null ) {
        if ( ! v . contains ( i ) ) {
          if ( v . size ( ) == n - 1 ) ans ++ ;
          else {
            stack . push ( i ) ;
            v . push ( i ) ;
            visited . push ( new Stack < > ( ) ) ;
            v . pop ( ) ;
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
