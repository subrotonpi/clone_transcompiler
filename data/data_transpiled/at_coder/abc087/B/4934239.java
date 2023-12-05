public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int counter = 0 ;
  for ( int a = 0 ;
  a < A + 1 ;
  a ++ ) {
    for ( int b = 0 ;
    b < B + 1 ;
    b ++ ) {
      for ( int c = 0 ;
      c < C + 1 ;
      c ++ ) {
        if ( 500 * a + 100 * b + 50 * c == X ) {
          counter ++ ;
        }
      }
    }
  }
  return counter ;
}
