public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Set < Integer >> posObss = new HashMap < > ( ) ;
  for ( int y = 0 ;
  y < W ;
  y ++ ) {
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    int Y = Integer . parseInt ( input . nextLine ( ) ) ;
    posObss . get ( Y - 1 ) . add ( X - 1 ) ;
  }
  int ans = H ;
  int xNow = 0 ;
  for ( int y = 0 ;
  y < W ;
  y ++ ) {
    int xLim = Math . min ( posObss . get ( y ) , xNow ) ;
    ans = Math . min ( ans , xLim ) ;
    if ( y == W - 1 ) break ;
    xNow ++ ;
    while ( posObss . get ( y + 1 ) . contains ( xNow ) ) xNow ++ ;
    if ( xNow >= xLim ) break ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
