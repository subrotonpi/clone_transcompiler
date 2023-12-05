public static int iceil ( int num , int den ) {
  return ( num + den - 1 ) / den ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int P = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] Q = new int [ N ] [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) Q [ n ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) Q [ n ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] LO = new int [ N ] [ N ] ;
    int [ ] [ ] HI = new int [ N ] [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      for ( int p = 0 ;
      p < P ;
      p ++ ) {
        LO [ n ] [ p ] = iceil ( 10 * Q [ n ] [ p ] , 11 * R [ n ] ) ;
        HI [ n ] [ p ] = ( 10 * Q [ n ] [ p ] ) / ( 9 * R [ n ] ) ;
      }
    }
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      for ( int p = 0 ;
      p < P ;
      p ++ ) {
        if ( LO [ n ] [ p ] == 0 ) LO [ n ] [ p ] = 1 ;
      }
    }
    int BUILT = 0 ;
    int [ ] first = new int [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      first [ n ] = 0 ;
    }
    while ( max ( first ) < P ) {
      int chcem = max ( LO [ n ] [ first [ n ] ] ) ;
      boolean dobre = true ;
      for ( int n = 0 ;
      n < N ;
      n ++ ) {
        if ( chcem > HI [ n ] [ first [ n ] ] ) {
          dobre = false ;
          first [ n ] ++ ;
        }
      }
      if ( dobre ) {
        BUILT ++ ;
        for ( int n = 0 ;
        n < N ;
        n ++ ) first [ n ] ++ ;
      }
    }
    System