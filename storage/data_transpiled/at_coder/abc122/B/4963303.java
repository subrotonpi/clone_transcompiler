public static void input ( ) {
  int counter = 0 ;
  int maxCount = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'A' : case 'C' : case 'G' : case 'T' : counter ++ ;
      break ;
      default : counter ++ ;
    }
  }
}
