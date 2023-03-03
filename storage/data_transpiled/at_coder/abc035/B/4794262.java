public static void print ( String s ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = 0 ;
  int y = 0 ;
  int d = 0 ;
  int count = 0 ;
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
      case '?' : count ++ ;
      break ;
    }
  }
  switch ( t ) {
    case 1 : System . out . println ( Math . max ( Math . abs ( x + count ) + Math . abs ( y ) , Math . abs ( x ) + Math . abs ( y + count ) , Math . abs ( x - count ) + Math . abs ( y ) , Math . abs ( x ) + Math . abs ( y - count ) ) ) ;
    break ;
    case 2 : d = Math . abs ( x ) + Math . abs ( y ) ;
    if ( d > count ) System . out . println ( d - count ) ;
    else {
      if ( ( d - count ) % 2 == 0 ) System . out . println ( 0 ) ;
      else System . out . println ( 1 ) ;
    }
    break ;
  }
}
