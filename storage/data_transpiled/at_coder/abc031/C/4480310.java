public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int S = Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  int [ ] taka = new int [ N ] ;
  int [ ] aoki = new int [ N ] ;
  int T = - 10000 ;
  int A = - 10000 ;
  int ta = 0 ;
  int ao = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i == j ) {
      }
      else {
        for ( int k = Math . min ( i , j ) ;
        k <= Math . max ( i , j ) ;
        k ++ ) {
          if ( ( k - Math . min ( i , j ) ) % 2 == 0 ) {
            ta += a [ k ] ;
          }
          else {
            ao += a [ k ] ;
          }
        }
        if ( A < ao ) {
          A = ao ;
          T = ta ;
        }
        ta = 0 ;
        ao = 0 ;
      }
    }
    taka [ i ] = T ;
    aoki [ i ] = A ;
    T = - 10000 ;
    A = - 10000 ;
  }
  System . out . println ( max ( taka ) ) ;
  return taka ;
}
