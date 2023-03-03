public static void input ( String s ) {
  s = input + "T" ;
  int n = s . length ( ) ;
  int x = Integer . parseInt ( s . substring ( 0 , 1 ) ) , y = Integer . parseInt ( s . substring ( 1 , n ) ) ;
  int fcnt = 0 ;
  int tcnt = 0 ;
  Set < Integer > xd = new HashSet < Integer > ( ) ;
  Set < Integer > yd = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == 'F' ) {
      fcnt ++ ;
      continue ;
    }
    if ( tcnt == 0 ) {
      xd . add ( fcnt ) ;
    }
    else if ( tcnt % 2 == 0 ) {
      Set < Integer > tmp = new HashSet < Integer > ( ) ;
      for ( int xx : xd ) {
        tmp . add ( xx - fcnt ) ;
        tmp . add ( xx + fcnt ) ;
      }
      xd = tmp ;
    }
    else {
      Set < Integer > tmp = new HashSet < Integer > ( ) ;
      for ( int yy : yd ) {
        tmp . add ( yy - fcnt ) ;
        tmp . add ( yy + fcnt ) ;
      }
      yd = tmp ;
    }
    tcnt ++ ;
    fcnt = 0 ;
  }
  if ( xd . contains ( x ) && yd . contains ( y ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
