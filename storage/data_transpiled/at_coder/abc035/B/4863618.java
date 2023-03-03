public static int input ( ) {
  int T = Integer . parseInt ( input ) ;
  int x = 0 ;
  int y = 0 ;
  int q = 0 ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    char s = S . charAt ( i ) ;
    switch ( s ) {
      case '?' : q ++ ;
      break ;
      case 'L' : x -- ;
      break ;
      case 'R' : x ++ ;
      break ;
      case 'U' : y -- ;
      break ;
      case 'D' : y ++ ;
      break ;
    }
  }
  if ( T == 1 ) {
    System . out . println ( Math . abs ( x ) + Math . abs ( y ) + q ) ;
  }
  else {
    int md = Math . abs ( x ) + Math . abs ( y ) ;
    int diff = md - q ;
    if ( diff > 0 ) {
      System . out . println ( diff ) ;
    }
    else {
      System . out . println ( diff % 2 ) ;
    }
  }
  return x ;
}
