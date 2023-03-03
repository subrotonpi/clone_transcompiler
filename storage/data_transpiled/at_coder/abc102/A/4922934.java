public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int c = 1 ;
  while ( true ) {
    if ( ( n * c ) % 2 == 0 ) {
      System . out . println ( n * c ) ;
      break ;
    }
    c ++ ;
  }
}
