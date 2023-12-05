public static double N = Double . parseDouble ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double ans = 1e9 ;
  for ( int i = 0 ;
  i < 1 << N ;
  i ++ ) {
    double a = 0 , b = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        a += A [ j ] ;
      }
      else {
        b += A [ j ] ;
      }
    }
    ans = Math . min ( ans , Math . max ( a , b ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
