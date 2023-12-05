static final int [ ] readIntList ( ) {
  return new int [ ] {
    Integer . parseInt ( input . readLine ( ) ) }
    ;
    /* read int */
    int [ ] intArr = new int [ ] {
      input . readLine ( ) }
      ;
      /* read strArr */
      int [ ] intArr = new int [ ] {
        input . readLine ( ) }
        ;
        /* solve */
        int X = input . readInt ( ) ;
        int K = input . readInt ( ) ;
        int [ ] r = new int [ Q ] ;
        int Q = input . readInt ( ) ;
        int j = 0 ;
        int sign = - 1 ;
        int s = 0 ;
        int e = X ;
        int y = 0 ;
        int origin = 0 ;
        int [ ] out = new int [ Q ] ;
        for ( int i = 0 ;
        i < Q ;
        i ++ ) {
          int t = input . readInt ( ) ;
          int a = input . readInt ( ) ;
          while ( j < K && r [ j ] < t ) {
            int d = r [ j ] - origin ;
            y += d * sign ;
            if ( y < 0 ) {
              s += Math . abs ( y ) ;
              if ( s > e ) s = e ;
              y = 0 ;
            }
            if ( y + e - s > X ) {
              int diff = ( y + e - s ) - X ;
              e -= diff ;
              if ( e < s ) e = s ;
            }
            if ( y > X ) y = X ;
            origin = r [ j ] ;
            j ++ ;
            sign *= - 1 ;
          }
          int d = t - origin ;
          int res ;
          if ( a <= s ) res = y ;
          else if ( a <= e ) res = y + a - s ;
          else res = y + e - s ;
          res += d * sign ;
          if ( res < 0 ) res = 0 ;
          if ( res > X ) res = X ;
          out [ i ] = res ;
        }
        /* main program */
        int [ ] res = solve ( ) ;
        System . out . println ( ( res ) ) ;
        if ( __name__ == "main" ) {
          main ( ) ;
        }
        return out ;
      }
      