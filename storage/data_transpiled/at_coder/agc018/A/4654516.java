public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /*if (a[i] == 0) {
  return a[i];
  } else {
  return gcd(b, a[i] % b);
  }*/
  if ( max ( a ) < k ) {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  else {
    int g = a [ 0 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      g = gcd ( max ( g , a [ i ] ) , min ( g , a [ i ] ) ) ;
    }
    if ( k % g == 0 ) {
      System . out . println ( "POSSIBLE" ) ;
    }
    else {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
  }
  return g ;
}
