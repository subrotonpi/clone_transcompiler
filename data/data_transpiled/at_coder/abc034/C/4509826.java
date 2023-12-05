public static int W = Integer . parseInt ( input ) {
  int M = 10 * 9 + 7 ;
  int a = 1 ;
  int b = 1 ;
  {
    if ( b == 0 ) {
      return 1 ;
    }
    else if ( b % 2 == 0 ) {
      return ( func ( a , b / 2 , p ) * p ) % p ;
    }
    else {
      return ( a * func ( a , b - 1 , p ) ) % p ;
    }
  }
}
