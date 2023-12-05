static void print ( String a ) {
  a = list ( input ) ;
  int n = a . length ( ) ;
  a = new int [ n ] ;
  a [ 0 ] = 0 ;
  int s = n ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( ( a [ i ] != a [ i + 1 ] ) ) {
      s = Math . min ( s , Math . max ( i , n - i ) ) ;
    }
  }
  System . out . println ( s ) ;
}
