public static void print ( int nnn ) {
  System . out . println ( "Case #" + nnn + ":" ) ;
  int B = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  if ( M > 2 * ( B - 2 ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  else {
    System . out . println ( "POSSIBLE" ) ;
    String num = Integer . toBinaryString ( M ) . substring ( 2 ) . toString ( ) ;
    if ( num . charAt ( 0 ) == '1' ) {
      System . out . println ( "0" + "1" * ( B - 1 ) ) ;
    }
    else {
      System . out . println ( "0" + num . substring ( 1 ) + "0" ) ;
    }
    for ( int i : xrange ( 1 , B ) ) {
      System . out . println ( "0" + i + "1" * ( B - i - 1 ) ) ;
    }
  }
}
