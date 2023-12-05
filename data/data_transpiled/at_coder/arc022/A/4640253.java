public static void print ( String s ) {
  s = String . valueOf ( input ( ) ) . toUpperCase ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( int j = i ;
    j < s . length ( ) ;
    j ++ ) {
      for ( int k = j ;
      k < s . length ( ) ;
      k ++ ) {
        if ( s . charAt ( i ) == 'I' && s . charAt ( j ) == 'C' && s . charAt ( k ) == 'T' ) {
          System . out . println ( "YES" ) ;
          exit ( ) ;
        }
      }
    }
  }
  System . out . println ( "NO" ) ;
}
