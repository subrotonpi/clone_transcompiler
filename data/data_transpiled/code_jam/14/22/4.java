public static int solve ( int A , int B , int K ) {
  int r = 0 ;
  for ( int a = 0 ;
  a < 32 ;
  a ++ ) {
    if ( A >> a & 1 ) {
      for ( int b = 0 ;
      b < 32 ;
      b ++ ) {
        if ( B >> b & 1 ) {
          for ( int k = 0 ;
          k < 32 ;
          k ++ ) {
            if ( K >> k & 1 ) {
              int t = 1 ;
              for ( int i = 0 ;
              i < 32 ;
              i ++ ) {
                if ( i < k ) {
                  if ( i < a && i < b ) t *= 4 ;
                  else if ( i < a || i < b ) t *= 2 ;
                  else t *= 1 ;
                }
                else {
                  int x = K >> i & 1 ;
                  if ( i == k ) x = 0 ;
                  if ( i < a && i < b ) t *= new int [ ] {
                    3 , 1 }
                    [ x ] ;
                    else if ( i < a || i < b ) {
                      int y ;
                      if ( i < a ) y = i == b ? 0 : B >> i & 1 ;
                      else y = i == a ? 0 : A >> i & 1 ;
                      if ( x == 0 && y == 0 ) t *= 2 ;
                      else if ( x == 0 && y == 1 ) t *= 1 ;
                      else if ( x == 1 && y == 0 ) t *= 0 ;
                      else if ( x == 1 && y == 1 ) t *= 1 ;
                    }
                    else {
                      y = ( i == a ? 0 : A >> i & 1 ) & ( i == b ? 0 : B >> i & 1 ) ;
                      if ( x == y ) t *= 1 ;
                      else t *= 0 ;
                    }
                  }
                }
                r += t ;
              }
            }
          }
        }
      }
    }
    for ( int t = 0 ;
    t < input . nextInt ( ) ;
    t ++ ) {
      A = Integer . parseInt ( input . nextLine ( ) ) ;
      B = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + solve ( A , B , K ) ) ;
    return r ;
  }
  