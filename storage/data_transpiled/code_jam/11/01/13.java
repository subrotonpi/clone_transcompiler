static void a ( ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i : xrange ( t ) ) {
    final String [ ] line = System . console ( ) . readLine ( ) . split ( " " ) ;
    final int n = Integer . parseInt ( line [ 0 ] ) ;
    int o = 1 ;
    int b = 1 ;
    int otime = 0 ;
    int btime = 0 ;
    String prev = null ;
    for ( int j : xrange ( n ) ) {
      final String color = line [ 1 + 2 * j ] , button = line [ 3 + 2 * j ] ;
      button = Integer . parseInt ( button ) ;
      if ( color . equals ( "O" ) ) {
        final int diff = Math . abs ( button - o ) + 1 ;
        if ( prev . equals ( "B" ) ) {
          otime = Math . max ( btime + 1 , otime + diff ) ;
        }
        else {
          otime += diff ;
        }
        o = button ;
      }
      else {
        diff = Math . abs ( button - b ) + 1 ;
        if ( prev . equals ( "O" ) ) {
          btime = Math . max ( otime + 1 , btime + diff ) ;
        }
        b = button ;
      }
      prev = color ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + Math . max ( otime , btime ) ) ;
  }
  a ( ) ;
}
