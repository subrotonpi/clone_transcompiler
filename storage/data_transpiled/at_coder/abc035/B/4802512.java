public static int input ( ) {
  String s = input . nextLine ( ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = 0 ;
  int y = 0 ;
  int q = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'U' : y ++ ;
      break ;
      case 'D' : y -- ;
      break ;
      case 'L' : x -- ;
      break ;
      case 'R' : x ++ ;
      break ;
      default : q ++ ;
    }
  }
  if ( t == 1 ) {
    System . out . println ( Math . abs ( x ) + Math . abs ( y ) + q ) ;
  }
  else {
    int d = Math . abs ( x ) + Math . abs ( y ) ;
    if ( d > q ) {
      System . out . println ( d - q ) ;
    }
    else {
      if ( ( d - q ) % 2 == 0 ) {
        System . out . println ( 0 ) ;
      }
      else {
        System . out . println ( 1 ) ;
      }
    }
  }
  return t ;
}
