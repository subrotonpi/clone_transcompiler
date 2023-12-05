public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    if ( 2 * i <= n && n < 2 * ( i + 1 ) ) {
      System . out . println ( 2 * i ) ;
      break ;
    }
  }
}
