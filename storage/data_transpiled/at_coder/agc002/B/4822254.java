public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  boolean [ ] red = new boolean [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    red [ i ] = false ;
  }
  red [ 1 ] = true ;
  int [ ] box = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    if ( red [ x ] ) {
      red [ y ] = true ;
    }
    box [ x ] -- ;
    box [ y ] ++ ;
    if ( box [ x ] == 0 ) {
      red [ x ] = false ;
    }
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( red [ i ] && box [ i ] > 0 ) {
      ans ++ ;
    }
  }
  return ans ;
}
