public static int N ( ) {
  String S = input ( ) ;
  int r = 0 ;
  int g = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'R' : r ++ ;
      break ;
      case 'G' : g ++ ;
      break ;
      case 'B' : b ++ ;
      break ;
    }
  }
  return ( r % 2 + b % 2 + g % 2 ) ;
}
