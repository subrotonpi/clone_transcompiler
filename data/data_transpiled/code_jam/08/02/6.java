@ Nullable private static LinkedHashMap < String , Integer > runCase ( @ NotNull BufferedReader reader ) throws IOException {
  DEBUG = false ;
  int amin = Integer . parseInt ( reader . readLine ( ) . trim ( ) ) ;
  int btrains = Integer . parseInt ( reader . readLine ( ) . trim ( ) ) ;
  if ( className . equals ( "java.lang.Object" ) ) {
    final String s = reader . readLine ( ) . trim ( ) ;
    if ( s . length ( ) > 0 ) runFile ( reader ) ;
    else runFile ( reader ) ;
  }
  else {
    final String st = reader . readLine ( ) . trim ( ) ;
    assert st . length ( ) == 5 ;
    return new LinkedHashMap < String , Integer > ( ) {
      {
        for ( String time : st . split ( " " ) ) {
          times . put ( time , Integer . parseInt ( time ) ) ;
        }
      }
    }
    ;
  }
  final String [ ] times = reader . readLine ( ) . split ( " " ) ;
  assert times . length == 2 ;
  return new LinkedHashMap < String , Integer > ( ) {
    {
      for ( String time : times ) {
        times . put ( time , Integer . parseInt ( time ) ) ;
      }
    }
  }
  ;
}
