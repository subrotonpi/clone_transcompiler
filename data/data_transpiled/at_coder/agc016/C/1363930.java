public static int [ ] [ ] getMatrix ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int INF = 10 * 10 ;
  int [ ] [ ] mat = new int [ H ] [ W ] ;
  int val = - h * w * 1000 + 999 ;
  for ( int hNew = h - 1 ;
  hNew < H ;
  hNew += h ) {
    for ( int wNew = w - 1 ;
    wNew < W ;
    wNew += w ) {
      mat [ wNew ] [ hNew ] = val ;
    }
  }
  if ( ( Integer . valueOf ( Math . pow ( mat [ j ] [ i ] , INF ) ) ) < 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        System . out . print ( mat [ j ] [ i ] + " " ) ;
      }
      System . out . println ( "" ) ;
    }
  }
  return mat ;
}
