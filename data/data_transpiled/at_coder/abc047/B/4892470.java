public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = 0 ;
  int y = 0 ;
  int a = 0 ;
  int p1 = 0 ;
  int p2 = W ;
  int p3 = 0 ;
  int p4 = H ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x = Integer . parseInt ( input . nextLine ( ) ) ;
    y = Integer . parseInt ( input . nextLine ( ) ) ;
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    switch ( a ) {
      case 1 : p1 = Math . max ( p1 , x ) ;
      break ;
      case 2 : p2 = Math . min ( p2 , x ) ;
      break ;
      case 3 : p3 = Math . max ( p3 , y ) ;
      break ;
      case 4 : p4 = Math . min ( p4 , y ) ;
      break ;
    }
  }
  if ( p1 >= p2 || p3 >= p4 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( p2 - p1 ) * ( p4 - p3 ) ) ;
  }
  return ( p1 + p2 ) * ( p4 - p3 ) ;
}
