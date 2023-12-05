static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
    int t = Integer . parseInt ( System . in . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < xrange ( t ) ;
    i ++ ) {
      String [ ] s = System . in . nextLine ( ) . split ( " " ) ;
      int n = Integer . parseInt ( s [ 0 ] ) ;
      int k = Integer . parseInt ( s [ 1 ] ) ;
      print ( "Case #" + ( i + 1 ) + ":" ) ;
      for ( int j : xrange ( n ) ) {
        if ( ( k & ( 2 * j ) ) == 0 ) {
          print ( "OFF" ) ;
          break ;
        }
      }
    }
  }
}
