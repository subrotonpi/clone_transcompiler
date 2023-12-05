public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] [ ] S = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = new String [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      S [ i ] [ j ] = input . substring ( i , i + 1 ) ;
    }
  }
  S = sum ( S , new String [ N ] ) ;
  int numT = S . length ;
  int numA = S [ 0 ] . length ;
  if ( numT > numA ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( numT < numA ) {
    System . out . println ( "AOKI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
