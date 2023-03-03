@ IMP ( "IMPOSSIBLE" ) public static String [ ] solvePrimary ( int R , int Y , int B ) throws IOException {
  String [ ] ret ;
  int N , O , G , V ;
  int test ;
  if ( R >= Y && R >= B ) {
    if ( 2 * R > R + Y + B ) return IMP ;
    ret = new String [ NUM_TESTS ] ;
    ret [ 0 ] = "RYB" ;
    ret [ 1 ] = "RY" ;
    ret [ 2 ] = "RY" ;
    System . out . println ( "Case #" + ( test + 1 ) + ": " + answer ) ;
    System . out . println ( "\n" ) ;
    System . out . println ( "\n" ) ;
  }
  else if ( Y >= R && Y >= B ) {
    if ( 2 * Y > R + Y + B ) return IMP ;
    ret = new String [ NUM_TESTS ] ;
    ret [ 0 ] = "YRB" ;
    ret [ 1 ] = "YR" ;
    System . out . println ( "\n" ) ;
    System . out . println ( "\n" ) ;
    System . out . println ( "\n" ) ;
  }
  else {
    if ( 2 * B > R + Y + B ) return IMP ;
    ret = new String [ NUM_TESTS ] ;
    ret [ 0 ] = "BRY" ;
    ret [ 1 ] = "BR" ;
    System . out . println ( "\n" ) ;
    System . out . println ( "\n" ) ;
    System . out . println ( "\n" ) ;
  }
  ret = new String [ NUM_TESTS ] ;
  for ( int i = 0 ;
  i < ret . length ;
  i ++ ) {
    ret [ i ] = "" ;
  }
  ret [ N ] = "" ;
  return ret ;
}
