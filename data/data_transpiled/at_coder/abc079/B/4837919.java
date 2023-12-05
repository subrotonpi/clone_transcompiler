public static void print ( int n ) {
  int l_i = 0 ;
  int l_i_1 = 1 ;
  int l_i_2 = 2 ;
  if ( n == 1 ) {
    System . out . println ( "1" ) ;
  }
  else {
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      l_i = 0 ;
      l_i = l_i_1 + l_i_2 ;
      l_i_2 = l_i_1 ;
      l_i_1 = l_i ;
    }
    System . out . println ( l_i ) ;
  }
}
