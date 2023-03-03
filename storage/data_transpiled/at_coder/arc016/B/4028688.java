public static int N = Integer . parseInt ( input ) {
  char [ ] [ ] inputs = new char [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = input . toCharArray ( ) ;
  }
  int s = 0 ;
  for ( int j = 0 ;
  j < 9 ;
  j ++ ) {
    char b = '\0' ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      char c = inputs [ i ] [ j ] ;
      if ( c == 'x' || ( c == 'o' && b != 'o' ) ) {
        s ++ ;
      }
      b = c ;
    }
  }
  return s ;
}
