public static String print ( String sa ) {
  StringBuilder sb = new StringBuilder ( ) ;
  StringBuilder sc = new StringBuilder ( ) ;
  String turn = "a" ;
  while ( ( sa = scanner . nextLine ( ) ) != null ) {
    if ( turn . equals ( "a" ) ) {
      if ( ! sa . isEmpty ( ) ) break ;
      turn = sa . toString ( ) ;
      -- sa . length ( ) ;
    }
    if ( turn . equals ( "b" ) ) {
      if ( ! sb . isEmpty ( ) ) break ;
      turn = sb . toString ( ) ;
      -- sb . length ( ) ;
    }
    if ( turn . equals ( "c" ) ) {
      break ;
    }
  }
  return turn . toUpperCase ( ) ;
}
