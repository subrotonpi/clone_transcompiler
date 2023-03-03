public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  /* egcd */
  final int x = 0 , lastx = 1 ;
  final int y = 1 , lasty = 0 ;
  while ( b != 0 ) {
    final int q = a / b ;
    ( a = b ) = a % b ;
    ( x = lastx - q * x ) = x ;
    ( y = lasty - q * y ) = y ;
  }
  return lastx ;
}
