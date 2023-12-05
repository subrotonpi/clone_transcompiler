public static int S ( ) {
  int start = 0 ;
  int last = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' ) {
      last = i ;
      break ;
    }
  }
  System . out . println ( last - start + 1 ) ;
}
