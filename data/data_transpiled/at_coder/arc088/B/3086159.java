public static void print ( String s ) {
  int n = s . length ( ) ;
  int v = n ;
  for ( int k = 0 ;
  k < n - 1 ;
  k ++ ) {
    if ( s . charAt ( k ) != s . charAt ( k + 1 ) ) {
      v = Math . min ( v , Math . max ( k + 1 , n - k - 1 ) ) ;
    }
  }
  System . out . println ( v ) ;
}
