@ Sys public static void Sys ( ) throws IOException {
  int T = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( stdin . readLine ( ) ) ;
    int p = Integer . parseInt ( stdin . readLine ( ) ) ;
    int q = Integer . parseInt ( stdin . readLine ( ) ) ;
    int r = Integer . parseInt ( stdin . readLine ( ) ) ;
    int s = Integer . parseInt ( stdin . readLine ( ) ) ;
    int NT = ( arange ( N ) * p + q ) % r + s ;
    int [ ] PS = new int [ N ] ;
    for ( int i = 0 ;
    i < NT ;
    i ++ ) {
      PS [ i ] = 0 ;
    }
    int S = PS [ N - 1 ] ;
    int minmax = S ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      int s1 = PS [ a ] ;
      int b0 = searchsorted ( PS , s1 + ( S - s1 ) / 2.0 ) ;
      assert b0 >= a ;
      for ( int b = b0 - 1 ;
      b < b0 ;
      b ++ ) {
        if ( 0 < b && b <= N ) {
          int mx = Math . max ( s1 , PS [ b ] - PS [ a ] , S - PS [ b ] ) ;
          if ( mx < minmax ) {
            minmax = mx ;
          }
        }
      }
    }
    System . out . println ( "Case #" + t + ":" + ( float ) ( S - minmax ) / S ) ;
  }
}
