public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  Point [ ] XY = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    XY [ i ] = new Point ( x , y ) ;
  }
  Arrays . sort ( XY ) ;
  int ans = H , d = 0 ;
  for ( Point xy : XY ) {
    int x = xy . x ;
    int y = xy . y ;
    if ( x == y + d ) {
      d ++ ;
    }
    else if ( x > y + d ) {
      ans = Math . min ( ans , x - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
}
