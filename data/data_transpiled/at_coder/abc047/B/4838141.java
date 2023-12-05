public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = input . nextInt ( ) ;
  int xLeft = 0 ;
  int xRight = W ;
  int yBottom = 0 ;
  int yTop = H ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    int a = input . nextInt ( ) ;
    switch ( a ) {
      case 1 : xLeft = x ;
      break ;
      case 2 : xRight = y ;
      break ;
    }
  }
  return xLeft ;
}
