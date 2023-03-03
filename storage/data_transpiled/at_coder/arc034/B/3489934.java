public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = Math . max ( 1 , n - 200 ) ;
  i < n ;
  i ++ ) {
    if ( i + Arrays . binarySearch ( String . valueOf ( i ) , n ) == n ) {
      a [ i ] = i ;
    }
  }
  System . out . println ( a . length ) ;
  for ( int x : a ) {
    System . out . println ( x ) ;
  }
}
