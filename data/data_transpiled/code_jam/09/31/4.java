public static void main ( String [ ] in ) throws IOException {
  int T = Integer . parseInt ( in [ 0 ] ) ;
  for ( int i : xrange ( 1 , T + 1 ) ) {
    String line = in [ 0 ] . trim ( ) ;
    List < String > digs = Lists . newArrayList ( line . split ( " " ) ) ;
    int base = Math . max ( 2 , Sets . newHashSet ( digs ) . size ( ) ) ;
    Map < String , Integer > vals = new HashMap < String , Integer > ( ) ;
    vals . put ( digs . get ( 0 ) , 1 ) ;
    int val = 0 ;
    for ( String d : digs ) {
      if ( ! vals . containsKey ( d ) ) {
        vals . put ( d , val ++ ) ;
        if ( val == 1 ) val = 2 ;
      }
    }
    int ans = 0 ;
    for ( String d : digs ) {
      ans *= base ;
      ans += vals . get ( d ) ;
    }
    System . out . println ( "Case #" + i + ": " + ans ) ;
  }
}
