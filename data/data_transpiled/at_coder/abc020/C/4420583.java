static final int [ ] [ ] G ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] S = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    String s = S [ i ] ;
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      String ss = s . substring ( j , j + 1 ) ;
      if ( ( ss . equals ( "S" ) ) ) {
        start = i ;
      }
      else if ( ( ss . equals ( "G" ) ) ) {
        goal = i ;
      }
    }
  }
  return new int [ ] [ ] {
    {
      start }
    }
    ;
  }
  