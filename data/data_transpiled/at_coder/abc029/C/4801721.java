public static int n = Integer . parseInt ( input ) {
  ArrayList < String > l = new ArrayList < String > ( ) ;
  {
    if ( l . size ( ) == n ) {
      l . add ( s ) ;
      return 0 ;
    }
    f ( s + "a" ) ;
    f ( s + "b" ) ;
    f ( s + "c" ) ;
  }
  f ( "" ) ;
  for ( String s : l ) {
    System . out . println ( s ) ;
  }
  return 0 ;
}
