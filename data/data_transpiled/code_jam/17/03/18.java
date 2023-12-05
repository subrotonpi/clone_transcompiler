public static int [ ] split ( int n ) {
  return new int [ ] {
    n / 2 , ( n - 1 ) / 2 }
    ;
    /* merge a */
    int n1 = n / 2 ;
    int n2 = n / 2 ;
    int b = n / 2 ;
    int m1 = n / 2 ;
    int m2 = n / 2 ;
    if ( n1 == m1 ) {
      return new int [ ] {
        a + a + b , n1 , b , m2 }
        ;
      }
      else if ( n2 == m2 ) {
        return new int [ ] {
          a , n1 , a + b + b , m2 }
          ;
        }
        else {
          throw new IllegalStateException ( "Can't reduce " + new Object [ ] {
            n1 , n2 , m1 , m2 }
            ) ;
          }
          /* solve a and b */
          int [ ] solve = new int [ ] {
            a , n , b , m , k }
            ;
            if ( k <= a ) {
              return split ( n ) ;
            }
            else if ( k <= a + b ) {
              return split ( m ) ;
            }
            else {
              /* t */
              return solve ( ( merge ( ( a ) + split ( n ) + ( b ) + split ( m ) ) ) + t ( k - a - b ) ) ;
            }
            /* main */
            int t = Integer . parseInt ( input ( ) ) ;
            for ( int ti = 0 ;
            ti < t ;
            ti ++ ) {
              int n = Integer . parseInt ( input ( ) ) ;
              int k = Integer . parseInt ( input ( ) ) ;
              System . out . println ( "Case #" + ( ti + 1 ) + ": " + Joiner . on ( " " ) . join ( solve ( 1 , n , 0 , n - 1 , k ) ) ) ;
            }
            if ( getClass ( ) . equals ( String . class ) ) {
              return solve ( 1 , n , 0 , n - 1 , k ) ;
            }
          }
          