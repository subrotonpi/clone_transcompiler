public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] list = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    list [ i ] = new char [ W ] ;
  }
  int [ ] [ ] dxy = {
    {
      - 1 , 0 }
      , {
        1 , 0 }
        , {
          0 , 1 }
          , {
            0 , - 1 }
          }
          ;
          boolean flg = true ;
          for ( int i = 0 ;
          i < H ;
          i ++ ) {
            for ( int j = 0 ;
            j < W ;
            j ++ ) {
              int count = 0 ;
              if ( list [ i ] [ j ] == '.' ) continue ;
              if ( list [ i ] [ j ] == '#' ) {
                for ( int l = 0 ;
                l < dxy . length ;
                l ++ ) {
                  int m = dxy [ l ] [ j ] ;
                  if ( ( i + l < 0 ) || ( i + l > H - 1 ) || ( j + m < 0 ) || ( j + m > W - 1 ) ) continue ;
                  if ( list [ i + l ] [ j + m ] == '#' ) count ++ ;
                }
              }
              if ( count == 0 ) flg = false ;
            }
          }
          if ( flg ) System . out . println ( "Yes" ) ;
          else System . out . println ( "No" ) ;
        }
        