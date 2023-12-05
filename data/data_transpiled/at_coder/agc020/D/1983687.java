static final int input ( ) {
  int Q = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    int C = Integer . parseInt ( input ( ) ) ;
    int D = Integer . parseInt ( input ( ) ) ;
    double K = Math . ceil ( Math . max ( A , B ) / ( Math . min ( A , B ) + 1 ) ) ;
    int lo = 0 , hi = A + 1 ;
    while ( hi - lo > 1 ) {
      int mid = ( lo + hi ) / 2 ;
      int rA = A - mid , rB = B - Math . max ( 0 , ( mid - 1 ) / K ) ;
      if ( ( rA + 1 ) * K < rB ) {
        hi = mid ;
      }
      else {
        lo = mid ;
      }
    }
    StringBuffer sb = new StringBuffer ( ) ;
    for ( int i = C - 1 ;
    i < D ;
    i ++ ) {
      int na = lo ;
      int nb = Math . max ( 0 , ( na - 1 ) / K ) ;
      if ( i < nb * ( K + 1 ) ) {
        sb . append ( ( char ) 'A' ) ;
        sb . append ( i % ( K + 1 ) == K ) ;
      }
      else if ( i < na + nb ) {
        sb . append ( 'A' ) ;
      }
      else {
        int j = A + B - i - 1 ;
        nb = B - nb ;
        na = Math . max ( 0 , ( nb - 1 ) / K ) ;
        if ( j < na * ( K + 1 ) ) {
          sb . append ( ( char ) 'B' ) ;
          sb . append ( j % ( K + 1 ) == K ) ;
        }
        else {
          sb . append ( 'B' ) ;
        }
      }
    }
    System . out . println ( sb ) ;
  }
  return Q ;
}
