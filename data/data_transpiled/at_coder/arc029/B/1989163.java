static final String input ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] C = new int [ N ] ;
  int [ ] D = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    D [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  StringBuilder buf = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    boolean curr = false ;
    if ( A <= C [ i ] && B <= D [ i ] ) {
      curr = true ;
    }
    if ( B <= C [ i ] && A <= D [ i ] ) {
      curr = true ;
    }
    if ( curr == false ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( j == 1 ) {
          int temp = A ;
          A = B ;
          B = temp ;
        }
        double lo = Math . atan ( B / A ) ;
        double hi = Math . PI / 2 ;
        double mid = 0 ;
        int cnt = 0 ;
        while ( lo < hi && cnt < 50 ) {
          mid = ( lo + hi ) / 2 ;
          if ( A * Math . sin ( mid ) + B * Math . cos ( mid ) < Math . max ( C [ i ] , D [ i ] ) ) {
            lo = mid ;
          }
          else {
            hi = mid ;
          }
          cnt ++ ;
        }
        if ( A * Math . cos ( lo ) + B * Math . sin ( lo ) <= Math . min ( C [ i ] , D [ i ] ) ) {
          curr |= true ;
        }
      }
    }
  }
  if ( curr == true ) {
    buf . append ( "YES" ) ;
  }
  else {
    buf . append ( "NO" ) ;
  }
  return buf . toString ( ) ;
}
