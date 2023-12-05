public static void print ( int H , int W ) {
  String S [ ] [ ] = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) S [ i ] = input . nextLine ( ) ;
  int [ ] dx = {
    1 , 0 , - 1 , 0 }
    ;
    int [ ] dy = {
      0 , 1 , 0 , - 1 }
      ;
      boolean flg = false ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          if ( S [ i ] [ j ] . equals ( "#" ) ) {
            flg = false ;
            for ( int k = 0 ;
            k < 4 ;
            k ++ ) {
              if ( S [ i + dy [ k ] ] [ j + dx [ k ] ] . equals ( "#" ) ) {
                flg = true ;
              }
            }
          }
          if ( flg == false ) {
            System . out . println ( "No" ) ;
            exit ( ) ;
          }
        }
      }
      System . out . println ( "Yes" ) ;
    }
    