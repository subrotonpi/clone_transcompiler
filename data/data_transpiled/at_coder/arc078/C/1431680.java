static final int [ ] readIntList ( ) {
  return new int [ ] {
    Integer . parseInt ( input . readLine ( ) ) }
    ;
    int [ ] result = new int [ ] {
      Integer . parseInt ( input . readLine ( ) ) }
      ;
      int [ ] result = new int [ ] {
        Integer . parseInt ( input . readLine ( ) ) }
        ;
        int [ ] result = new int [ ] {
          Integer . parseInt ( input . readLine ( ) ) }
          ;
          int [ ] result = new int [ ] {
            Integer . parseInt ( input . readLine ( ) ) }
            ;
            boolean debug = false ;
            int N = 5600070 ;
            if ( debug ) {
              System . out . println ( ) ;
              System . out . println ( "N:" + N ) ;
              System . out . println ( ) ;
            }
            {
              int n = input . nextInt ( ) ;
              if ( debug ) {
                int res = ( n <= N && String . valueOf ( n ) . compareTo ( N ) <= 0 ) || ( n >= N && String . valueOf ( n ) . compareTo ( N ) >= 0 ) ;
                System . out . print ( "?" + n + "\t" + res ) ;
                return res ;
              }
              System . out . print ( "?" + n ) ;
              return input . readLine ( ) == 'y' || input . readLine ( ) == 'Y' ;
            }
            private int solve ( ) {
              if ( result [ 0 ] == 'y' ) {
                for ( int k = 0 ;
                k < 10 ;
                k ++ ) {
                  if ( result [ k ] == 2 * 10 * k ) return 10 * k ;
                }
              }
              int l = 1 ;
              while ( result [ l ++ ] == 'n' ) ;
              int [ ] d = new int [ l ] ;
              for ( int p = 0 ;
              p < l ;
              p ++ ) {
                int a = 0 ;
                if ( p == 0 ) a = 1 ;
                int b = 9 ;
                d [ p ] = a ;
                int n = Integer . parseInt ( result [ p ] ) ;
                if ( result [ p ] == 10 * n ) continue ;
                while ( b - a > 1 ) {
                  int m = ( a + b ) / 2 ;
                  d [ p ] = m ;
                  n = Integer . parseInt ( result [ p ] ) ;
                  if ( result [ p ] == 10 * n ) b = m ;
                  else a = m ;
                }
                d [ p ] = b ;
              }
              result [ 0 ] = n ;
              return result ;
              