public static int getDistance ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  if ( a % 2 == 1 && b % 2 == 1 && c % 2 == 1 ) {
    System . out . println ( 0 ) ;
  }
  else if ( a == b && b == c ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int _a = a , _b = b , _c = c ;
    int ai = 0 ;
    while ( true ) {
      if ( _a % 2 == 0 ) {
        _a /= 2 ;
        ai ++ ;
      }
      else {
        break ;
      }
    }
    int bi = 0 ;
    while ( true ) {
      if ( _b % 2 == 0 ) {
        _b /= 2 ;
        bi ++ ;
      }
      else {
        break ;
      }
    }
    int ci = 0 ;
    while ( true ) {
      if ( _c % 2 == 0 ) {
        _c /= 2 ;
        ci ++ ;
      }
      else {
        break ;
      }
    }
    int min2 = Math . min ( ai , bi , ci ) ;
    double div2 = Math . pow ( 2 , min2 ) ;
    a /= div2 ;
    b /= div2 ;
    c /= div2 ;
    if ( ( a + b ) % 2 == 0 && ( a + c ) % 2 == 0 && ( c + b ) % 2 == 0 ) {
      min2 ++ ;
    }
    System . out . println ( min2 ) ;
  }
  return min2 ;
}
