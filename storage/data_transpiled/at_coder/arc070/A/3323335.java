public static void print ( int n ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( i * ( i + 1 ) / 2 >= n ) {
      ans = i ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
