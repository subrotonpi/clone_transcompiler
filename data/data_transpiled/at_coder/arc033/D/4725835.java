public static int powMod ( int a , int x , int m ) {
  int y = 1 ;
  while ( 0 < x ) {
    if ( x % 2 == 1 ) {
      y *= a ;
      y %= m ;
    }
    x /= 2 ;
    a = a * a ;
    a %= m ;
  }
  /* mod inv */
  return powMod ( a , m - 2 , m ) ;
}
