public static String [ ] [ ] resize ( String [ ] [ ] W ) {
  int n = Integer . parseInt ( input [ 0 ] [ ] ) ;
  String [ ] [ ] resize = new String [ n ] [ ] ;
  W [ 0 ] = new String [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    String [ ] newW = new String [ n ] ;
    if ( W [ 0 ] . contains ( newW [ i ] ) ) {
      if ( i % 2 == 0 ) {
        System . out . println ( "WIN" ) ;
        break ;
      }
      else {
        System . out . println ( "LOSE" ) ;
        break ;
      }
    }
    else {
      String [ ] lastW = resize [ W . length - 1 ] ;
      if ( lastW [ W . length - 1 ] . equals ( newW [ 0 ] ) ) {
        if ( i % 2 == 0 ) {
          System . out . println ( "WIN" ) ;
          break ;
        }
        else {
          System . out . println ( "LOSE" ) ;
          break ;
        }
      }
      else {
        resize [ W . length - 1 ] = newW ;
      }
    }
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
  return resize ;
}
