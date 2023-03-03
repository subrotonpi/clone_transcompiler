public static int x = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  /* if (b == 0) {
  return a;
  } else {
  return gcd(b, a%b);
  }*/
  x = x / gcd ( x , y ) ;
  y = y / gcd ( x , y ) ;
  if ( x < y ) {
    System . err . println ( "Impossible" ) ;
    exit ( ) ;
  }
  int n1 = 2 * x / y ;
  int n2 = 2 * x / y + 1 ;
  boolean flag = false ;
  if ( n1 % y == 0 ) {
    int m = n1 * ( n1 + 1 ) / 2 - n1 * x / y ;
    if ( 1 <= m && m <= n1 ) {
      flag = true ;
      System . err . println ( n1 + " " + m ) ;
    }
  }
  if ( n2 % y == 0 ) {
    int m = n2 * ( n2 + 1 ) / 2 - n2 * x / y ;
    if ( 1 <= m && m <= n2 ) {
      flag = true ;
      System . err . println ( n2 + " " + m ) ;
    }
  }
  if ( ! flag ) {
    System . err . println ( "Impossible" ) ;
  }
  return x ;
}
