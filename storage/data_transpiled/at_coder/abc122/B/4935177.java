public static int getDigit ( ) {
  String a = input . next ( ) ;
  int b = a . length ( ) ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    switch ( a . charAt ( i ) ) {
      case 'A' : case 'T' : case 'G' : case 'C' : x ++ ;
      break ;
      default : x = 0 ;
    }
    if ( ( x > y ) && ( y > x ) ) y = x ;
  }
  return y ;
}
