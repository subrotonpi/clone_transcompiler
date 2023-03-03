public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . equals ( T ) ) {
      break ;
    }
    S = S . substring ( S . length ( ) - 1 ) + S ;
    S = S . substring ( 0 , S . length ( ) - 1 ) ;
  }
  if ( S . equals ( T ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
