public static void print ( String input ) {
  a = Integer . parseInt ( input ) ;
  a = a / 1000 ;
  double v ;
  if ( a < 0.1 ) {
    v = 00 ;
  }
  else if ( a >= 0.1 && a <= 5 ) {
    v = a * 10 ;
  }
  else if ( a >= 6 && a <= 30 ) {
    v = a + 50 ;
  }
  else if ( a >= 35 && a <= 70 ) {
    v = a ;
  }
}
