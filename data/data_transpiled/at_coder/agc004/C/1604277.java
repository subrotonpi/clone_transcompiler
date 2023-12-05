@ GwtIncompatible ( "java.util.regex.Pattern" ) private static void check ( String [ ] [ ] ans1 , String [ ] [ ] ans2 , String [ ] field ) {
  final int INF = 10 * 10 ;
  /* check for each of the fields */
  int h = ans1 . length ;
  int w = ans1 [ 0 ] . length ;
  int [ ] [ ] ans = new int [ h ] [ w ] ;
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      char c = ans1 [ y ] [ x ] == ans2 [ y ] [ x ] ? '#' : '.' ;
      if ( field [ y ] [ x ] != c ) {
        System . out . println ( y + " " + x ) ;
      }
    }
  }
  /* main program */
  int H = Integer . parseInt ( input ( ) ) ;
  int W = Integer . parseInt ( input ( ) ) ;
  field = new String [ H ] [ W ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    field [ y ] = input . substring ( 0 , w ) ;
  }
  char [ ] [ ] ans1 = new char [ W ] [ H ] ;
  char [ ] [ ] ans2 = new char [ W ] [ W ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      if ( field [ y ] [ x ] == '#' ) {
        if ( y % 2 == 0 ) {
          ans2 [ y ] [ x ] = '#' ;
        }
        else {
          ans1 [ y ] [ x ] = '.' ;
        }
      }
    }
  }
  /* check for each of the fields */
  for ( char [ ] line : ans ) {
    System . out . println ( Arrays . toString ( line ) ) ;
  }
  System . out . println ( ) ;
  for ( char [ ] line : ans2 ) {
    System . out . println ( Arrays . toString ( line ) ) ;
  }
}
