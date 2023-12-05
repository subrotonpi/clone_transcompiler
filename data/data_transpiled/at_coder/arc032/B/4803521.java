static public int [ ] [ ] unite ( int x , int y , int [ ] par ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int n = input . nextInt ( ) ;
  final int m = input . nextInt ( ) ;
  int [ ] par = new int [ n ] ;
  int [ ] rank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  /* find the first element in the list */
  if ( par [ x ] == x ) {
    return par ;
  }
  else {
    /* unite the first element in the list */
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    if ( x != y ) {
      if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
      }
      else {
        par [ y ] = x ;
        if ( rank [ x ] == rank [ y ] ) {
          rank [ x ] ++ ;
        }
      }
    }
  }
  /* same the first element in the list */
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input . nextInt ( ) - 1 ;
    int b = input . nextInt ( ) ;
    unite ( a , b , par , rank ) ;
  }
  int res = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( par [ i ] == i ) {
      res ++ ;
    }
  }
  System . out . println ( res ) ;
  return par ;
}
