public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  int flg = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    S = S . substring ( S . length ( ) - 1 ) + S . substring ( 0 , S . length ( ) - 1 ) ;
    if ( S . equals ( T ) ) {
      flg = 1 ;
    }
  }
  if ( flg == 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
