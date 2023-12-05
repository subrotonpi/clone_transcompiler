public static int W = Integer . parseInt ( input ) {
  int W = 0 , H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = input . nextInt ( ) ;
  int w = 0 , h = 0 ;
  for ( ;
  ;
  ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    switch ( a ) {
      case 1 : w = Math . max ( w , x ) ;
      break ;
      case 2 : W = Math . min ( W , x ) ;
      break ;
      case 3 : h = Math . max ( h , y ) ;
      break ;
      default : H = Math . min ( H , y ) ;
      break ;
    }
  }
  if ( W < w || H < h ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( W - w ) * ( H - h ) ) ;
  }
  return W ;
}
