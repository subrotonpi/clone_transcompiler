@ VisibleForTesting static int from ( int R , int C ) {
  int X = Integer . parseInt ( input ( ) ) ;
  int Y = Integer . parseInt ( input ( ) ) ;
  int D = Integer . parseInt ( input ( ) ) ;
  int L = Integer . parseInt ( input ( ) ) ;
  int den = factorial ( D ) * factorial ( L ) ;
  /* pattern */
  if ( n < D + L ) {
    return 0 ;
  }
  /* pattern */
  int gorioshi0 = pattern ( X * Y ) ;
  int gorioshi1 = 2 * pattern ( ( X - 1 ) * Y ) + 2 * pattern ( X * ( Y - 1 ) ) ;
  int gorioshi2 = 4 * pattern ( ( X - 1 ) * ( Y - 1 ) ) ;
  int gorioshi3 = 0 ;
  int gorioshi4 = 0 ;
  if ( X >= 2 ) {
    gorioshi2 += pattern ( ( X - 2 ) * Y ) ;
    gorioshi3 += 2 * pattern ( ( X - 1 ) * ( Y - 2 ) ) ;
  }
  System . out . println ( ( ( ( R + 1 - X ) * ( C + 1 - Y ) ) * ( gorioshi0 - gorioshi1 + gorioshi2 - gorioshi3 + gorioshi4 ) ) % 1000000007 ) ;
  return 0 ;
}
