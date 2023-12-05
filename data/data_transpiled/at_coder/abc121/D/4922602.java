public static int g ( int a ) {
  int n = a + 1 ;
  if ( n % 2 == 0 ) {
    return ( n / 2 ) % 2 ;
  }
  else {
    int p = ( n / 2 ) % 2 ;
    return p ^ a ;
  }
  {
    if ( a == 0 ) {
      return g ( b ) ;
    }
    else {
      return g ( b ) ^ g ( a - 1 ) ;
    }
  }
}
