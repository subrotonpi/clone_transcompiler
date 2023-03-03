public static int [ ] [ ] x ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int [ ] y = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ i ] = a + b ;
    y [ i ] = a - b ;
  }
  int xmax = max ( x ) ;
  int xmin = min ( x ) ;
  int ymax = max ( y ) ;
  int ymin = min ( y ) ;
  int d = max ( xmax - xmin , ymax - ymin ) ;
  int [ ] [ ] p = {
    {
      xmax - d / 2 , ymax - d / 2 }
      , {
        xmax - d / 2 , ymin + d / 2 }
        , {
          xmin + d / 2 , ymax - d / 2 }
          , {
            xmin + d / 2 , ymin + d / 2 }
          }
          ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            int [ ] e = p [ i ] ;
            int c = 0 ;
            for ( int j = 0 ;
            j < n ;
            j ++ ) {
              if ( c == 0 ) {
                int dx = Math . abs ( x [ j ] - e [ 0 ] ) ;
                int dy = Math . abs ( y [ j ] - e [ 1 ] ) ;
                if ( max ( dx , dy ) != d / 2 ) {
                  c = 1 ;
                }
              }
            }
            if ( c == 0 ) {
              System . out . println ( ( e [ 0 ] + e [ 1 ] ) / 2 + " " + ( e [ 0 ] - e [ 1 ] ) / 2 ) ;
              exit ( ) ;
            }
          }
          return x ;
        }
        