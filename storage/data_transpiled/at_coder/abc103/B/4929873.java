public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( T . equals ( S . substring ( i ) + S . length ( ) ) ) {
      System . out . println ( "Yes" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "No" ) ;
}
