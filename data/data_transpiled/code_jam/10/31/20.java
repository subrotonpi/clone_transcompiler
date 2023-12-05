public static void for ( int izi : xrange ( 1 , 1 + Integer . parseInt ( readLine ( ) ) ) ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] wires = new int [ n ] [ n ] ;
  for ( String z : readLine ( ) . split ( " " ) ) {
    for ( int k = 0 ;
    k < n ;
    k ++ ) wires [ k ] [ 0 ] = Integer . parseInt ( z ) ;
  }
  Arrays . sort ( wires ) ;
  int sc = Arrays . stream ( xrange ( wires . length - 1 ) ) . mapToInt ( i -> 1 ) . mapToInt ( j -> xrange ( i , wires . length ) ) . sum ( ) ;
  System . out . println ( "Case #" + izi + ": " + sc ) ;
}
