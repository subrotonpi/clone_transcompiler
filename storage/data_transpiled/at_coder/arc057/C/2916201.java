public static void print ( String input ) {
  int p = Integer . parseInt ( input ) ;
  int a = p * p ;
  int b = ( p + 1 ) * ( p + 1 ) ;
  if ( a + ( 100 - a % 100 ) % 100 >= b ) {
    System . out . println ( a ) ;
  }
  else {
    int num = 100 ;
    while ( num < a ) {
      int sub = ( num - ( a % num ) ) % num ;
      if ( a + sub >= b ) {
        break ;
      }
      a += sub ;
      num *= 100 ;
    }
    while ( a % 100 == 0 ) {
      a /= 100 ;
    }
    System . out . println ( a ) ;
  }
}
