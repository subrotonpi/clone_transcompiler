public static String toString ( Scanner input ) {
  int len = input . nextInt ( ) ;
  Map < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
  for ( int i = 97 ;
  i <= 97 + 26 ;
  i ++ ) {
    char c = input . next ( ) ;
    if ( c != '' && map . get ( c ) == 0 ) {
      result = c ;
      break ;
    }
  }
  return ( result != '' ? result : "None" ) ;
}
