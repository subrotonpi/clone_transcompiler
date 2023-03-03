public static int input ( ) {
  int x = 0 , y = 0 , q = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'L' : x -- ;
      break ;
      case 'R' : x ++ ;
      break ;
      case 'U' : y ++ ;
      break ;
      case 'D' : y -- ;
      break ;
      default : q ++ ;
    }
  }
  int t = Integer . parseInt ( input ( ) ) ;
  if ( t == 1 ) {
    System . out . println ( Math . abs ( x ) + Math . abs ( y ) + q ) ;
  }
  else {
    if ( 0 <= ( Math . abs ( x ) + Math . abs ( y ) - q ) ) {
      System . out . println ( Math . abs ( x ) + Math . abs ( y ) - q ) ;
    }
    else {
      System . out . println ( ( q - Math . abs ( x ) - Math . abs ( y ) ) % 2 ) ;
    }
  }
  return t ;
}
