public static void print ( String input ) {
  int H = ( Integer ) input . split ( " " ) . length ;
  int W = ( Integer ) input . split ( " " ) . length ;
  String [ ] [ ] s = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s [ i ] [ 0 ] = "." ;
    s [ i ] [ 1 ] = input . substring ( 0 , 1 ) ;
  }
  Arrays . sort ( s ) ;
  int [ ] [ ] around = {
    {
      - 1 , 0 }
      , {
        0 , - 1 }
        , {
          0 , 1 }
          , {
            1 , 0 }
          }
          ;
          boolean clear = true ;
          for ( int i = 1 ;
          i <= H ;
          i ++ ) {
            for ( int j = 1 ;
            j <= W ;
            j ++ ) {
              if ( s [ i ] [ j ] == "#" ) {
                if ( Arrays . binarySearch ( around [ i + k [ 0 ] ] , around [ j + k [ 1 ] ] ) >= 0 ) {
                  clear = false ;
                  break ;
                }
              }
            }
            else {
              continue ;
            }
            break ;
          }
          if ( clear ) {
            System . out . println ( "Yes" ) ;
          }
          else {
            System . out . println ( "No" ) ;
          }
        }
        