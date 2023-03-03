public static String unhappyHacking ( @ NonNull String s ) {
  StringBuffer display = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char key = s . charAt ( i ) ;
    switch ( key ) {
      case '0' : display . append ( '0' ) ;
      break ;
      case '1' : display . append ( '1' ) ;
      break ;
      default : display . delete ( display . length ( ) - 1 , display . length ( ) ) ;
    }
  }
  return display . toString ( ) ;
}
