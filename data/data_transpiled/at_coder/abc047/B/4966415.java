public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = input . nextInt ( ) ;
  String [ ] [ ] xya = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xya [ i ] = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xya [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = H , w = W ;
  int x0 = 0 , y0 = 0 ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    switch ( xya [ i ] [ 2 ] ) {
      case 1 : if ( xya [ i ] [ 0 ] <= w ) x0 = Math . max ( xya [ i ] [ 0 ] , x0 ) ;
      else ans = 0 ;
      break ;
      case 2 : if ( x0 <= xya [ i ] [ 0 ] && xya [ i ] [ 0 ] <= w ) w = xya [ i ] [ 0 ] ;
      else if ( xya [ i ] [ 0 ] < x0 ) ans = 0 ;
      break ;
      case 3 : if ( xya [ i ] [ 1 ] <= h ) y0 = Math . max ( xya [ i ] [ 1 ] , y0 ) ;
      else ans = 0 ;
      break ;
      default : if ( y0 <= xya [ i ] [ 1 ] && xya [ i ] [ 1 ] <= h ) h = xya [ i ] [ 1 ] ;
      else if ( xya [ i ] [ 1 ] < y0 ) ans = 0 ;
      break ;
    }
  }
  if ( ans != 0 ) ans = ( w - x0 ) * ( h - y0 ) ;
  System . out . println ( ans ) ;
  return ans ;
}
