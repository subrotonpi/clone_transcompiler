public static void main ( String [ ] args ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int caseno : xrange ( T ) ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int k = Integer . parseInt ( readLine ( ) ) ;
    String res ;
    if ( ( k + 1 ) % ( 2 * n ) == 0 ) {
      res = "ON" ;
    }
    else {
      res = "OFF" ;
    }
    System . out . println ( "Case #" + ( caseno + 1 ) + ": " + res ) ;
  }
}
