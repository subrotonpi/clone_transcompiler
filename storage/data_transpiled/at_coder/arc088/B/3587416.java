public static void print ( String s ) {
  s = list ( input ) ;
  int n = s . length ( ) ;
  int res = 10 * 6 ;
  for ( int k = 0 ;
  k < n - 1 ;
  k ++ ) {
    if ( s . charAt ( k ) != s . charAt ( k + 1 ) ) {
      res = Math . min ( res , Math . max ( k + 1 , n - k - 1 ) ) ;
    }
  }
  if ( res == 10 * 6 ) {
    res = n ;
  }
  System . out . println ( res ) ;
}
