public static void print ( int H , int W ) {
  String [ ] s = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) s [ i ] = input . substring ( 0 , W ) ;
  int [ ] dx = {
    1 , 0 , - 1 , 0 }
    ;
    int [ ] dy = {
      0 , 1 , 0 , - 1 }
      ;
      boolean ans = true ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          if ( s [ i ] . charAt ( j ) == '.' ) {
            continue ;
          }
          else {
            boolean check = true ;
            for ( int k = 0 ;
            k < dx . length ;
            k ++ ) {
              int y = i + dy [ k ] ;
              int x = j + dx [ k ] ;
              if ( x < 0 || x > ( W - 1 ) || y < 0 || y > ( H - 1 ) ) {
                continue ;
              }
              else {
                if ( s [ y ] . charAt ( x ) == '#' ) {
                  check = false ;
                }
              }
            }
            if ( check ) {
              ans = false ;
              break ;
            }
          }
        }
        if ( ! ans ) break ;
      }
      if ( ans ) System . out . println ( "Yes" ) ;
      else System . out . println ( "No" ) ;
    }
    