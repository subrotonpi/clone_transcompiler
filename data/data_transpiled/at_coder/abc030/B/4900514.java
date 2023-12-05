public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  double a = 30 * n + 0.5 * m ;
  double b = 6 * m ;
  double c = Math . abs ( a - b ) ;
  if ( c <= 180 ) {
    System . out . println ( c ) ;
  }
  else if ( c >= 360 && c < 540 ) {
    System . out . println ( c - 360 ) ;
  }
  else if ( c >= 540 ) {
    System . out . println ( 720 - c ) ;
  }
  else {
    System . out . println ( 360 - c ) ;
  }
}
