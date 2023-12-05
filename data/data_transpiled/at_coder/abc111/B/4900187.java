public static void print ( int N ) {
  int [ ] list = new int [ N ] ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    list [ i ] = 111 * i ;
  }
  int num = 0 ;
  for ( int i : list ) {
    if ( N <= i ) {
      num = i ;
      break ;
    }
  }
  System . out . println ( num ) ;
}
