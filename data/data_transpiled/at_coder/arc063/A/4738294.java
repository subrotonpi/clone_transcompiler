public static void print ( String s ) {
  int c = 1 ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) != s . charAt ( i + 1 ) ) {
      c ++ ;
    }
  }
  System . out . println ( c - 1 ) ;
}
