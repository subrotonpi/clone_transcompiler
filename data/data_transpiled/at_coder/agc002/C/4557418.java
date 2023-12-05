public static int [ ] getStdOut ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int l = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] mu = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    mu [ i ] = a [ i ] + a [ i + 1 ] ;
  }
  if ( max ( mu ) < l ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    System . out . println ( "Possible" ) ;
    int s = mu . indexOf ( max ( mu ) ) ;
    for ( int i = 1 ;
    i <= s ;
    i ++ ) {
      System . out . println ( i ) ;
    }
    for ( int i = n - 1 ;
    i >= s ;
    i -- ) {
      System . out . println ( i ) ;
    }
  }
  return mu ;
}
