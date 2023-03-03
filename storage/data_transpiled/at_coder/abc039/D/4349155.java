public static void print ( int H , int W ) {
  String [ ] S = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] T = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) S [ i ] [ 0 ] = new String ( input . nextLine ( ) ) ;
  for ( int j = 0 ;
  j < W ;
  j ++ ) T [ j ] [ 0 ] = new String ( "" ) ;
  int [ ] dy = {
    1 , 1 , 1 , 0 , - 1 , - 1 , - 1 , 0 }
    ;
    int [ ] dx = {
      1 , 0 , - 1 , - 1 , - 1 , 0 , 1 , 1 }
      ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          boolean flag = true ;
          for ( int k = 0 ;
          k < 8 ;
          k ++ ) {
            int ni = i + dx [ k ] ;
            int nj = j + dy [ k ] ;
            if ( 0 <= ni && ni < H && 0 <= nj && nj < W ) {
              if ( S [ ni ] [ nj ] . equals ( "." ) ) {
                flag = false ;
                break ;
              }
            }
          }
          if ( flag && S [ i ] [ j ] . equals ( "#" ) ) T [ i ] [ j ] = "#" ;
          else T [ i ] [ j ] = "." ;
        }
      }
      String [ ] [ ] U = new String [ H ] [ W ] ;
      for ( int j = 0 ;
      j < W ;
      j ++ ) U [ j ] = new String [ H ] [ W ] ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          if ( T [ i ] [ j ] . equals ( "." ) ) continue ;
          U [ i ] [ j ] = "#" ;
          for ( int k = 0 ;
          k < 8 ;
          k ++ ) {
            int ni = i + dx [ k ] ;
            int nj = j + dy [ k ] ;
            if ( 0 <= ni && ni < H && 0 <= nj && nj < W ) U [ ni ] [ nj ] = "#" ;
          }
        }
      }
      flag = true ;
      for ( int i = 0