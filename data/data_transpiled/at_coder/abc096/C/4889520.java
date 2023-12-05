public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String s [ ] [ ] = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s [ i ] [ 0 ] = input ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s [ i ] [ j ] . equals ( "#" ) ) {
        boolean bool1 = i > 0 && s [ i - 1 ] [ j ] . equals ( "#" ) ;
        boolean bool2 = i < H - 1 && s [ i + 1 ] [ j ] . equals ( "#" ) ;
        boolean bool3 = j > 0 && s [ i ] [ j - 1 ] . equals ( "#" ) ;
        boolean bool4 = j < W - 1 && s [ i ] [ j + 1 ] . equals ( "#" ) ;
        if ( bool1 || bool2 || bool3 || bool4 ) {
          continue ;
        }
        else {
          System . out . println ( "No" ) ;
          exit ( ) ;
        }
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
