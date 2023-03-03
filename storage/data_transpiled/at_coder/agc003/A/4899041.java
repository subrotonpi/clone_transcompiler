public static String S = input ( ) {
  int n = S . indexOf ( 'N' ) ;
  int s = S . indexOf ( 'S' ) ;
  int e = S . indexOf ( 'E' ) ;
  int w = S . indexOf ( 'W' ) ;
  if ( ( n >= 1 && s >= 1 ) || ( n == 0 && s == 0 ) ) {
    if ( ( e >= 1 && w >= 1 ) || ( e == 0 && w == 0 ) ) {
      System . out . println ( "Yes" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "No" ) ;
  return null ;
}
