public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int * a , i ;
  a = Integer . parseInt ( input ) ;
  for ( i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a + a + a + 1 >= l ) {
      System . out . println ( "Possible" ) ;
      System . out . print ( new StringBuilder ( i + 2 ) . append ( " " ) . append ( a ) . append ( "\n" ) ) ;
      System . out . print ( new StringBuilder ( 1 ) . append ( a ) . append ( "\n" ) ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
