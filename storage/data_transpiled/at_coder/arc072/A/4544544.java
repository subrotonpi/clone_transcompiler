public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int [ ] p = {
    1 , - 1 }
    ;
    int [ ] j = {
      - 1 , 1 }
      ;
      int c = 0 ;
      int l = 0 ;
      int d = 0 ;
      int e = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int s = i % 2 ;
        c += a [ i ] ;
        l += a [ i ] ;
        if ( p [ s ] * c <= 0 ) {
          d += Math . abs ( c - p [ s ] ) ;
          c = p [ s ] ;
        }
        if ( j [ s ] * l <= 0 ) {
          e += Math . abs ( l - j [ s ] ) ;
          l = j [ s ] ;
        }
      }
      System . out . println ( Math . min ( e , d ) ) ;
    }
    