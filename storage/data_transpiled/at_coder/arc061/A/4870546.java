public static void print ( String S ) {
  if ( S . length ( ) == 1 ) {
    System . out . println ( S ) ;
  }
  else {
    byte [ ] bs = new byte [ 2 * ( S . length ( ) - 1 ) ] ;
    for ( int i = 0 ;
    i < bs . length ;
    i ++ ) bs [ i ] = Integer . toBinaryString ( i ) ;
    String [ ] [ ] operators = new String [ bs . length ] [ 2 ] ;
    for ( int i = 0 ;
    i < bs . length ;
    i ++ ) {
      operators [ i ] = bs [ i ] [ i ] == '0' ? '' : '+' ;
    }
    String [ ] formulas = new String [ operators . length ] ;
    for ( int i = 0 ;
    i < formulas . length ;
    i ++ ) {
      formulas [ i ] = StringUtils . join ( S . charAt ( i ) , operator [ i ] ) + S . charAt ( s . length ( ) - 1 ) ;
    }
    System . out . println ( Arrays . toString ( formulas ) ) ;
  }
}
