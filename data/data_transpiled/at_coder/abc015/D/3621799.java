public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] dp = new int [ N ] [ K + 1 ] ;
  for ( int v = 0 ;
  v < N ;
  v ++ ) {
    dp [ v ] [ v ] = 10000000 ;
  }
  int vMax = 0 ;
  int V = 0 ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    int width = Integer . parseInt ( input . nextLine ( ) ) ;
    int value = Integer . parseInt ( input . nextLine ( ) ) ;
    V += value ;
    for ( int v = V ;
    v >= 0 ;
    v -- ) {
      for ( int k = Math . min ( n + 1 , K ) ;
      k >= 0 ;
      k -- ) {
        switch ( v ) {
          case 0 : if ( k == 0 ) dp [ v ] [ k ] = 0 ;
          break ;
          case 1 : break ;
          case 2 : break ;
          default : break ;
        }
      }
      else {
        if ( v >= value ) dp [ v ] [ k ] = Math . min ( dp [ v - value ] [ k - 1 ] + width , dp [ v ] [ k ] ) ;
        else dp [ v ] [ k ] = dp [ v ] [ k ] ;
      }
      if ( n == N - 1 && vMax < v && dp [ v ] [ k ] <= W ) vMax = v ;
    }
  }
  System . out . println ( vMax ) ;
  return V ;
}
