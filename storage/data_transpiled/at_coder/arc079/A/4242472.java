public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] c = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    c [ a - 1 ] [ b ] = 1 ;
    c [ b - 1 ] [ a ] = 1 ;
  }
  for ( int a = 0 ;
  a < c [ 0 ] . length ;
  a ++ ) {
    if ( c [ a - 1 ] [ a ] . contains ( n ) ) {
      System . out . println ( "POSSIBLE" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
}
