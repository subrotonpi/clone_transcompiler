public static int input ( ) {
  int S = input . nextInt ( ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = 0 ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < S ;
  i ++ ) {
    char a = S . charAt ( i ) ;
    switch ( a ) {
      case 'R' : x ++ ;
      break ;
      case 'L' : x -- ;
      break ;
      case 'U' : y ++ ;
      break ;
      case 'D' : y -- ;
      break ;
      default : c ++ ;
    }
  }
  int d = Math . abs ( x ) + Math . abs ( y ) ;
  if ( T == 1 ) {
    System . out . println ( d + c ) ;
  }
  else {
    if ( d < c ) {
      if ( ( c - d ) % 2 == 0 ) {
        System . out . println ( 0 ) ;
      }
      else {
        System . out . println ( 1 ) ;
      }
    }
    else {
      System . out . println ( d - c ) ;
    }
  }
  return d ;
}
