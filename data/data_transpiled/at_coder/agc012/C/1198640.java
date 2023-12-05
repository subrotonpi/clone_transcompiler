public static List < Integer > f ( int n ) {
  if ( n == 1 ) {
    return Collections . emptyList ( ) ;
  }
  if ( n % 2 == 0 ) {
    List < Integer > r = f ( n / 2 ) ;
    int k = r . size ( ) ;
    return r . stream ( ) . map ( Integer :: valueOf ) . collect ( toList ( ) ) ;
  }
  if ( n % 2 == 1 ) {
    r = f ( n - 1 ) ;
  }
  return r ;
}
