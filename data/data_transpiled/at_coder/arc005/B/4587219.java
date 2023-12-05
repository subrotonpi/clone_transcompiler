@ Sys public static String from ( ) {
  String input = System . getProperty ( "input" ) ;
  String x , y , w ;
  x = input . split ( " " ) [ 0 ] ;
  y = input . split ( " " ) [ 1 ] ;
  w = input . split ( " " ) [ 2 ] ;
  x = Integer . parseInt ( x ) - 1 ;
  y = Integer . parseInt ( y ) - 1 ;
  String [ ] [ ] L = new String [ 9 ] [ ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    String L_ = input . split ( " " ) [ 0 ] ;
    L [ i ] = L_ ;
  }
  String [ ] [ ] R = new String [ 3 ] [ ] ;
  R [ 0 ] = new String [ ] {
    y , x }
    ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      if ( w . contains ( "R" ) ) x ++ ;
      if ( w . contains ( "L" ) ) x -- ;
      if ( w . contains ( "U" ) ) y -- ;
      if ( w . contains ( "D" ) ) y ++ ;
      R [ i ] [ 1 ] = new String [ ] {
        y , x }
        ;
      }
      String ans = "" ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        if ( R [ i ] [ i ] > 8 ) x = 16 - x ;
        if ( x < 0 ) x = - x ;
        if ( y > 8 ) y = 16 - y ;
        if ( y < 0 ) y = - y ;
        ans += L [ i ] [ i ] ;
      }
      System . out . println ( ans ) ;
      return ans ;
    }
    