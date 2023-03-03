public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] arr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( arr ) ;
  int total = Arrays . stream ( arr ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
  if ( arr [ arr . length - 1 ] < total ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
