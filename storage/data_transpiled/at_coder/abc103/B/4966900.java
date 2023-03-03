public static void input ( ) {
  S = input ( ) ;
  T = input ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . substring ( i ) + S . substring ( 0 , i ) . equals ( T ) ) {
      System . out . println ( "Yes" ) ;
      quit ( ) ;
    }
  }
  System . out . println ( "No" ) ;
}
