public static String getWord ( ) {
  int x , y , W ;
  String [ ] a ;
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  y = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new String [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) a [ i ] = input . nextLine ( ) ;
  int dx = W . contains ( "R" ) ? 1 : W . contains ( "L" ) ? - 1 : 0 ;
  int dy = W . contains ( "D" ) ? 1 : W . contains ( "U" ) ? - 1 : 0 ;
  String ans = "" ;
  ans = ans + a [ y ] [ x ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    if ( x + dx == 9 ) {
      dx = - 1 ;
      x = 7 ;
    }
    else if ( x + dx == - 1 ) {
      dx = 1 ;
      x = 1 ;
    }
    else x = x + dx ;
    if ( y + dy == 9 ) {
      dy = - 1 ;
      y = 7 ;
    }
    else if ( y + dy == - 1 ) {
      dy = 1 ;
      y = 1 ;
    }
    else y = y + dy ;
    ans = ans + a [ y ] [ x ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
