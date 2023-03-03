static final int [ ] [ ] m = {
  {
    0 , 0 , 0 , 0 , 0 }
    , {
      0 , 1 , 2 , 3 , 4 }
      , {
        0 , 2 , - 1 , 4 , - 3 }
        , {
          0 , 3 , - 4 , - 1 , 2 }
          , {
            0 , 4 , 3 , - 2 , - 1 }
          }
          ;
          final String c = " 1ijk" ;
          {
            int sign = a >= 0 ? 1 : - 1 ;
            {
              int sign = sign >= 0 ? 1 : - 1 ;
              int mul = sign * sign * sign + b ;
              {
                int a = sign ;
                int b = sign > 0 ? 1 : - 1 ;
                return mul * sign * sign + b ;
              }
              {
                int a = sign > 0 ? 1 : - 1 ;
                int b = sign > 0 ? 1 : - 1 ;
                {
                  int c = c . indexOf ( c ) ;
                  return c . charAt ( a ) ;
                }
              }
              {
                int c = c . indexOf ( c ) ;
              }
              {
                int p = 1 ;
                int goal = 2 ;
                for ( int i = 0 ;
                i < s . length ( ) ;
                i ++ ) {
                  char ch = s . charAt ( i ) ;
                  p = mul ( p , char2int ( ch ) ) ;
                  if ( p == goal ) {
                    goal ++ ;
                    p = 1 ;
                  }
                }
                return goal == 5 && p == 1 ;
              }
            }
            final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
            for ( int t = 0 ;
            t < T ;
            t ++ ) {
              int L = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
              int X = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
              int S = System . console ( ) . readLine ( ) ;
              if ( X < 8 ) S *= X ;
              else S *= 8 + ( X % 4 ) ;
              System . out . println ( "Case #" + ( t + 1 ) + ": " + ( isDijkstra ( S ) ? "YES" : "NO" ) ) ;
            }
            