public static void main ( String input , int W , int H , int N ) {
  int x0 = 0 , y0 = 0 , x1 = W , y1 = H ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    int a = Integer . parseInt ( input ) ;
    switch ( a ) {
      case 1 : if ( x0 < x ) x0 = x ;
      break ;
      case 2 : if ( x < x1 ) x1 = x ;
      break ;
      case 3 : if ( y0 < y ) y0 = y ;
      break ;
      default : if ( y < y1 ) y1 = y ;
      break ;
    }
  }
  if ( x1 - x0 < 0 || y1 - y0 < 0 ) System . out . println ( 0 ) ;
  else System . out . println ( ( x1 - x0 ) * ( y1 - y0 ) ) ;
}
