public static void tnum ( Scanner in ) {
  int tnum = in . nextInt ( ) ;
  for ( int ti = 0 ;
  ti < tnum ;
  ti ++ ) {
    String s = in . next ( ) ;
    int k = in . nextInt ( ) ;
    int [ ] array = new int [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      array [ i ] = s . charAt ( i ) == '+' ? 0 : 1 ;
    }
    int len = Integer . parseInt ( s . substring ( 0 , len ) ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < len - k + 1 ;
    i ++ ) {
      if ( array [ i ] == 1 ) {
        ans ++ ;
        for ( int j = 0 ;
        j < k ;
        j ++ ) {
          array [ i + j ] = 1 - array [ i + j ] ;
        }
      }
    }
    System . out . println ( "Case #" + ( ti + 1 ) + ": " + ( sum ( array ) == 0 ? ans : "IMPOSSIBLE" ) ) ;
  }
}
