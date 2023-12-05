public static void main ( String input ) {
  int n = ( int ) input . charAt ( 0 ) ;
  int l = ( int ) input . charAt ( 1 ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] + a [ i + 1 ] >= l ) {
      System . out . println ( "Possible" ) ;
      for ( int j = n ;
      j > i + 2 ;
      j -- ) System . out . println ( j - 1 ) ;
      for ( int k = 1 ;
      k <= i + 2 ;
      k ++ ) System . out . println ( k ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Impossible" ) ;
}
