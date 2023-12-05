public static void print ( int n ) {
  int max = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int tmp = i * ( n - i ) ;
    if ( tmp > max ) max = tmp ;
  }
  System . out . println ( max ) ;
}
