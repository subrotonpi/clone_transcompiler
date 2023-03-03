public static void input ( Scanner input ) {
  int W = input . nextInt ( ) ;
  int H = input . nextInt ( ) ;
  int N = input . nextInt ( ) ;
  int lx = 0 , dy = 0 , rx = W , uy = H ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    int a = input . nextInt ( ) ;
    switch ( a ) {
      case 1 : if ( lx <= x ) lx = x ;
      break ;
      case 2 : if ( x <= rx ) rx = x ;
      break ;
      case 3 : if ( dy <= y ) dy = y ;
      break ;
      case 4 : if ( y <= uy ) uy = y ;
      break ;
    }
  }
  if ( rx - lx <= 0 || uy - dy <= 0 ) System . out . println ( 0 ) ;
  else System . out . println ( ( rx - lx ) * ( uy - dy ) ) ;
}
