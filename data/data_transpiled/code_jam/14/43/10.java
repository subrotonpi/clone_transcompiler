[ ] , directions = {
  "left" , "up" , "right" , "down" }
  ;
  {
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] stack = new int [ W ] [ H ] ;
    int [ ] [ ] cells = new int [ W ] [ B ] ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      if ( t - 1 >= 0 && cells [ t - 1 ] [ t ] == 1 ) {
        stack [ t ] = new int [ ] {
          i - 1 , j , "down" }
          ;
        }
      }
      {
        int [ ] [ ] stack = new int [ ] [ ] ;
        for ( int i = 0 ;
        i < W ;
        i ++ ) {
          if ( j + 1 < W && cells [ i ] [ j + 1 ] == 1 ) {
            stack [ t ] = new int [ ] {
              i , j + 1 , "right" }
              ;
            }
          }
          {
            int [ ] [ ] stack = new int [ ] [ ] ;
            for ( int i = 0 ;
            i < H ;
            i ++ ) {
              if ( j - 1 >= 0 && cells [ i ] [ j - 1 ] == 1 ) {
                stack [ t ] = new int [ ] {
                  i , j - 1 , "left" }
                  ;
                }
              }
            }
            int count = 0 ;
            for ( int _j = 0 ;
            _j < W ;
            _j ++ ) {
              if ( cells [ 0 ] [ _j ] == 0 ) continue ;
              cells [ 0 ] [ _j ] = 0 ;
              int i = 0 ;
              int j = _j ;
              Stack < Integer > stack = new Stack < Integer > ( ) ;
              if ( i + 1 < H && cells [ i + 1 ] [ j ] == 1 ) {
                stack . push ( new int [ ] {
                  i + 1 , j , "up" }
                  ) ;
                }
                while ( stack . size ( ) > 0 ) {
                  i = stack . pop ( ) ;
                  j = 0 ;
                  int d = 0 ;
                  if ( cells [ i ] [ j ] == 0 ) continue ;
                  cells [ i ] [ j ] = 0 ;
                  if ( i == H - 1 ) {
                    count ++ ;
                    break ;
                  }
                  int f = directions . indexOf ( d ) ;
                  java . util . Arrays . sort ( directions ) ;
                  for ( int offset = 0 ;
                  offset < 4 ;
                  offset ++ ) {
                    java . util . Arrays . sort ( directions ) ;
                  }
                  