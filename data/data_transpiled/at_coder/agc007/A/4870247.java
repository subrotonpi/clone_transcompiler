public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String [ ] A_s = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) A_s [ i ] = input . split ( " " ) ;
  int [ ] pos = {
    0 , 0 }
    ;
    int num = 1 ;
    do {
      if ( pos [ 0 ] == H - 1 && pos [ 1 ] == W - 1 ) {
        int total = Integer . parseInt ( A_s [ i ] ) ;
        ans = total == num ;
        break ;
      }
      int h = pos [ 0 ] ;
      int w = pos [ 1 ] ;
      if ( h != H - 1 && pos [ 1 ] == W ) {
        pos [ 1 ] = 0 ;
        num ++ ;
        continue ;
      }
    }
    while ( num > 0 ) ;
    System . out . println ( ans ? "Possible" : "Impossible" ) ;
  }
  