public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int * a [ ] = Integer . parseInt ( input ) ;
  int [ ] v = new int [ n ] ;
  v [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] + a [ i + 1 ] >= l ) {
      v [ 0 ] = i + 1 ;
      v [ 1 ] += Integer . parseInt ( input ) ;
      v [ 2 ] += Integer . parseInt ( input ) ;
      v [ 3 ] += Integer . parseInt ( input ) ;
      System . out . println ( "Possible" ) ;
      System . out . print ( ( char ) v [ 0 ] + "\n" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
