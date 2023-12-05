public static void input ( Scanner in ) {
  int l = in . nextInt ( ) ;
  String A = in . next ( ) ;
  int flg = 0 ;
  if ( A . contains ( "C" ) ) {
    int C = A . indexOf ( "C" ) ;
    if ( C > 0 ) {
      System . out . println ( "WA" ) ;
      flg = 1 ;
    }
  }
  if ( S . charAt ( 0 ) == 'A' && S . substring ( 2 , l - 1 ) . indexOf ( "C" ) == 1 && Character . isLowerCase ( S . substring ( 1 , C ) ) && Character . isLowerCase ( S . substring ( C + 1 ) ) ) {
    System . out . println ( "AC" ) ;
  }
  else {
    if ( flg == 0 ) {
      System . out . println ( "WA" ) ;
    }
  }
}
