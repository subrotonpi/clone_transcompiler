static final double INF = Double . POSITIVE_INFINITY , MOD = 10 * * 9 + 7 ;
final double MAX = - INF , MIN = INF ;
double dx1 [ ] , dy1 [ ] , dx2 [ ] , dy2 [ ] ;
double [ ] [ ] dx1 = {
  {
    - 1 , 0 , 1 , 0 }
    , {
      0 , - 1 , 0 , 1 }
      , {
        - 1 , 0 , 1 , - 1 , 1 , - 1 , 0 , 1 }
        , {
          - 1 , - 1 , - 1 , 0 , 0 , 1 , 1 , 1 }
        }
        ;
        /* int */
        int n = Integer . parseInt ( input ( ) ) ;
        /* int */
        int [ ] [ ] intArray = {
          Integer . parseInt ( input ( ) ) , Integer . parseInt ( input ( ) ) }
          /* int */
          {
            int [ ] [ ] mins = {
              Integer . MIN_VALUE , Integer . MAX_VALUE }
              ;
              int [ ] maxs = {
                Integer . MAX_VALUE , Integer . MIN_VALUE }
                ;
                /* int [][] mins = [0, 1, 0] */
                int [ ] fact = {
                  Integer . MIN_VALUE , Integer . MAX_VALUE }
                  ;
                  int tmp ;
                  int m ;
                  while ( ( n = intArray [ n ] [ 0 ] ) != 0 ) {
                    tmp = 1 ;
                    for ( int i = 2 ;
                    i <= n ;
                    i ++ ) {
                      tmp = ( int ) ( tmp * i % MOD ) ;
                    }
                  }
                  /* int [] fact = [0, 1, 0] */
                  while ( ( m = intArray [ m ] [ 0 ] ) != 0 ) {
                    try {
                      n = intArray [ n ] [ 0 ] ;
                      m = intArray [ m ] [ 1 ] ;
                      if ( ( n == m ) && ( Math . abs ( n - m ) == 1 ) ) {
                        System . out . println ( ( int ) ( fact ( n ) * fact ( m ) % MOD ) ) ;
                      }
                      else if ( ( Math . abs ( n - m ) == 1 ) && ( Math . abs ( m - n ) == 1 ) ) {
                        System . out . println ( ( int ) ( fact ( n ) * fact ( m ) % MOD ) ) ;
                      }
                      else {
                        System . out . println ( 0 ) ;
                      }
                    }
                    catch ( IOException e ) {
                      exit ( ) ;
                    }
                  }
                  return new double [ ] {
                  }
                  ;
                }
                