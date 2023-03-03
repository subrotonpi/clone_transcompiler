public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int P = 10 * 9 + 7 ;
  int X = ( A * C - B * C + A * B ) % P ;
  int Y = ( B * C - A * B ) % P ;
  int Z = ( B * C - A * C ) % P ;
  /* egcd */
  final int x = 0 , lastx = 1 ;
  final int y = 1 , lasty = 0 ;
  while ( b != 0 ) {
    final int q = a / b ;
    ( a = b ;
    b = a % b ) ;
    ( x = lastx - q * x ) = x ;
    lastx = lasty - q * y ;
  }
  /* inv */
  return ( Z * inv ( X ) ) % P ;
}
