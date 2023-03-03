static final int [ ] solve ( int [ ] input ) {
  for ( int tc = 0 ;
  tc < input . length ;
  tc ++ ) {
    int N = Integer . parseInt ( input [ 0 ] ) ;
    int P = Integer . parseInt ( input [ 1 ] ) ;
    int R = Integer . parseInt ( input [ 2 ] ) ;
    int [ ] Q = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int t : Integer . parseInt ( input [ 2 ] ) ) {
        t /= R [ i ] ;
        double s = Math . max ( 1 , Math . ceil ( t / 1.1 ) ) ;
        double r = Math . floor ( t / 0.9 ) ;
        if ( r < s ) continue ;
        Q [ i ] = new int [ ] {
          s , - 1 , i }
          ;
          Q [ i ] = new int [ ] {
            r , 1 , i }
            ;
          }
        }
        Arrays . sort ( Q ) ;
        int [ ] C = new int [ N ] ;
        int [ ] U = new int [ N ] ;
        int r = 0 ;
        for ( int i = 0 ;
        i < Q . length ;
        i ++ ) {
          int j = Q [ i ] ;
          int k = Q [ i ] ;
          if ( j == - 1 ) {
            C [ k ] ++ ;
            if ( Arrays . binarySearch ( C , U [ k ] ) >= 0 ) {
              for ( int l = 0 ;
              l < N ;
              l ++ ) {
                C [ l ] -- ;
                U [ l ] ++ ;
              }
              r ++ ;
            }
          }
          else {
            if ( U [ k ] != 0 ) U [ k ] -- ;
            else C [ k ] -- ;
          }
        }
        System . out . println ( "Case #" + ( tc + 1 ) + ": " + r ) ;
      }
      return C ;
    }
    