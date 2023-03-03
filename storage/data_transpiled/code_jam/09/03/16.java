@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( final String [ ] args ) throws IOException {
  final String stCount = "welcome to code jam" ;
  final Map < Character , Integer > mapCount = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < stCount . length ( ) ;
  i ++ ) {
    mapCount . put ( stCount . charAt ( i ) , i ) ;
  }
  final String rsreadline = new String ( args ) ;
  main ( ) ;
  final int cCase = Integer . parseInt ( rsreadline ) ;
  for ( int iCase = 0 ;
  iCase <= cCase ;
  iCase ++ ) {
    final Map < Character , Integer > r = new HashMap < > ( ) ;
    r . put ( 0 , 1 ) ;
    final StringTokenizer st = new StringTokenizer ( rsreadline ) ;
    while ( st . hasMoreTokens ( ) ) {
      final char c = st . nextToken ( ) ;
      for ( int p : mapCount . get ( c ) ) {
        if ( r . containsKey ( p ) ) {
          r . put ( p + 1 , r . get ( p ) ) ;
        }
      }
    }
    System . out . printf ( "Case #%d: %04d%n" , iCase + 1 , r . get ( stCount . length ) % 10000 ) ;
    stdout . flush ( ) ;
  }
}
