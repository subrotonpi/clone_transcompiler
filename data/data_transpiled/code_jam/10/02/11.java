@ Sys public static int gcd ( int a , int b ) {
  while ( a % b != 0 ) {
    int t = b ;
    b = a % b ;
    a = t ;
  }
  /* Compute the gcd of the two integers */
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int g = a ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    g = gcd ( g , i ) ;
  }
  /* Compute the gcd of the two integers */
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int [ ] A = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int N = A [ 0 ] ;
    int [ ] a = new int [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      a [ i ] = A [ i ] ;
    }
    int [ ] b = new int [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( a [ i ] != a [ 0 ] ) {
        b [ i ] = a [ i ] - a [ 0 ] ;
      }
    }
    int g = gcd ( b ) ;
    int r = g - a [ 0 ] % g ;
    if ( a [ 0 ] % g == 0 ) {
      r = 0 ;
    }
    System . out . println ( "Case #" + t + ": " + r ) ;
  }
  return g ;
}
