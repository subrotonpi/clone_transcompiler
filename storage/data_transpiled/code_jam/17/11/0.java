public static int tc = Integer . parseInt ( input ) {
  for ( int i = 1 ;
  i <= tc ;
  i ++ ) {
    System . out . println ( "Case #" + i + ":" ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    String [ ] ll = new String [ r ] ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) ll [ j ] = input . nextLine ( ) . trim ( ) ;
    int z = 0 ;
    while ( ll [ z ] . equals ( "?" ) ) z ++ ;
    String last = ll [ z ] ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) {
      String ls ;
      if ( ll [ j ] . equals ( "?" ) ) ls = last ;
      else ls = ll [ j ] ;
      last = ls ;
      int y = 0 ;
      while ( ls . charAt ( y ) == '?' ) y ++ ;
      String lc = ls . substring ( y ) ;
      String [ ] tt = new String [ y ] ;
      for ( int j = 0 ;
      j < y ;
      j ++ ) {
        String cc = ls . substring ( j , y ) ;
        if ( cc . equals ( "?" ) ) System . out . print ( lc ) ;
        else {
          System . out . print ( cc ) ;
          lc = cc ;
        }
      }
      System . out . println ( ) ;
    }
  }
  return tc ;
}
