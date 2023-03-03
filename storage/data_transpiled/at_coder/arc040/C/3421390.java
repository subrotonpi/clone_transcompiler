public static void print ( int N ) {
  int [ ] lines = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lines [ i ] = input . nextInt ( ) ;
  }
  int count = 0 ;
  int y = - 1 ;
  boolean flag = false ;
  while ( y < N - 1 ) {
    y ++ ;
    int x = N ;
    while ( x > 0 ) {
      x -- ;
      if ( ( lines [ y ] [ x ] == '.' ) ) {
        count ++ ;
        if ( y + 1 <= N - 1 ) y ++ ;
        else flag = true ;
        break ;
      }
    }
    if ( flag ) break ;
  }
  System . out . println ( count ) ;
}
