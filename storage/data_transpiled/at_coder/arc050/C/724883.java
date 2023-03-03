public static int gcd ( int x , int y ) {
  if ( y == 0 ) {
    return x ;
  }
  else {
    return gcd ( y , x % y ) ;
  }
  /* One two integers */
  if ( i < 3 ) {
    return Integer . valueOf ( Math . pow ( 10 , j * l , M ) ) % M ;
  }
  else {
    return ( oneOne ( 2 , ( i / 2 ) * l , M ) * oneOne ( i / 2 , l , M ) + ( i % 2 ) * Math . pow ( 10 , ( i - 1 ) * l , M ) ) % M ;
  }
}
