public static int x , int y , int num = Integer . parseInt ( input ) {
  int [ ] gaiz = new int [ x ] ;
  int kaisu = x ;
  for ( int i = 0 ;
  i < num ;
  i ++ ) {
    int xg = Integer . parseInt ( input . nextLine ( ) ) ;
    int yg = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( xg >= yg ) {
      int sa = xg - yg ;
      if ( yg < gaiz [ sa ] ) {
        gaiz [ sa ] = ( yg ) ;
      }
    }
  }
  if ( gaiz . length == 0 ) {
    System . out . println ( kaisu ) ;
  }
  else {
    for ( ;
    num < gaiz . length - 1 ;
    num ++ ) {
      final int maegai = gaiz [ num ] ;
      final int gai = gaiz [ num ] ;
      if ( maegai > gai && num + gai < kaisu ) {
        kaisu = num + gai ;
      }
    }
    System . out . println ( kaisu ) ;
  }
  return kaisu ;
}
