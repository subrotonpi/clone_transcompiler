public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ) ;
  double ans = 1e7 ;
  for ( int i = 1 ;
  i < 11 ;
  i ++ ) {
    for ( int j = 1 ;
    j < 11 ;
    j ++ ) {
      if ( i == j ) continue ;
      int [ ] [ ] b = new int [ n ] [ j ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) b [ k ] [ k ] = a [ k ] ;
      int cnt = Integer . parseInt ( input ) ;
      ans = Math . min ( ans , cnt ) ;
    }
  }
  System . out . println ( ans * c ) ;
}
