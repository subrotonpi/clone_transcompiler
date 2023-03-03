, INF = INF , MOD = 1e9 + 7 ;
MAX = - INF ;
MIN = INF ;
double [ ] dx1 = {
  - 1 , 0 , 1 , 0 }
  , dy1 = {
    0 , - 1 , 0 , 1 }
    , dx2 = {
      - 1 , 0 , 1 , - 1 , 1 , - 1 , 0 , 1 }
      , dy2 = {
        - 1 , - 1 , - 1 , 0 , 0 , 1 , 1 , 1 }
        ;
        /* int */
        int getInt = Integer . parseInt ( input ) ;
        /* int */
        int [ ] intArray = {
          Integer . parseInt ( input ) }
          /* int */
          int [ ] mins = {
            Integer . MIN_VALUE , Integer . MAX_VALUE }
            ;
            /* int */
            int [ ] maxs = {
              Integer . MIN_VALUE , Integer . MAX_VALUE }
              ;
              /* int */
              while ( ( n = getInt [ 0 ] ) != 0 ) {
                try {
                  int n = Integer . parseInt ( input ) ;
                  int [ ] a = intArray [ n ] ;
                  System . out . println ( ( n % 2 ) ? a [ 0 ] + a [ 1 ] : a [ 0 ] + a [ 1 ] ) ;
                }
                catch ( NumberFormatException e ) {
                  exit ( ) ;
                }
              }
              return new Double ( ( n / 2 ) + ( n % 2 ) + ( n % 2 ) ) ;
            }
            