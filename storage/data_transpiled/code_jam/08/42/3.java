static final String doTest ( Scanner input ) {
  final String [ ] line = input . nextLine ( ) . split ( "\\s+" ) ;
  int N = Integer . parseInt ( line [ 0 ] ) ;
  int M = Integer . parseInt ( line [ 1 ] ) ;
  int A = Integer . parseInt ( line [ 2 ] ) ;
  boolean flipped = false ;
  if ( M > N ) {
    int z = M ;
    M = N ;
    N = z ;
    flipped = true ;
  }
  if ( A > M * N ) {
    return "IMPOSSIBLE" ;
  }
  int beta = - ( ( - A ) % M ) ;
  int alpha = ( A - beta ) / M + beta ;
  int a = M ;
  int b = M - 1 ;
  int x2 = 0 ;
  int x1 = alpha - beta ;
  int x3 = - beta ;
  int y3 = 0 ;
  int y1 = b ;
  int y2 = a ;
  if ( ! flipped ) {
    return Integer . toString ( x1 ) + ' ' + y1 + ' ' + x2 + ' ' + y2 + ' ' + x3 + ' ' + y3 ;
  }
  else {
    return Integer . toString ( y1 ) + ' ' + x1 + ' ' + y2 + ' ' + x2 + ' ' + y3 + ' ' + x3 ;
  }
}
