public static int N = Integer . parseInt ( input ) {
  int M = 0 , a = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    System . out . println ( "?" + 1 + ( i + 1 ) ) ;
    int dist = Integer . parseInt ( input ) ;
    if ( M < dist ) {
      M = dist ;
    }
  }
  return M ;
}
