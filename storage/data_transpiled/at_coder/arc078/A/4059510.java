public static double getDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] rui = new int [ n + 1 ] ;
  rui [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rui [ i + 1 ] = rui [ i ] + a [ i ] ;
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    ans = Math . min ( ans , Math . abs ( rui [ i ] - ( rui [ n ] - rui [ i ] ) ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
