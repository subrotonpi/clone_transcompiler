public static void print ( int n ) {
  int [ ] ans = new int [ n ] ;
  ans [ 0 ] = - 1000 ;
  ans [ 1 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int j = i ;
    while ( ( j % 2 ) == 0 ) {
      ans [ i ] ++ ;
      j /= 2 ;
    }
  }
  System . out . println ( ans . indexOf ( max ( ans ) ) ) ;
}
