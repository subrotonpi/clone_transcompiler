static String solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String xs [ ] = input . nextLine ( ) . split ( "\\s+" ) ;
    final int x1 = Integer . parseInt ( xs [ 0 ] ) ;
    final int y1 = Integer . parseInt ( xs [ 1 ] ) ;
    final int x2 = Integer . parseInt ( xs [ 2 ] ) ;
    final int y2 = Integer . parseInt ( xs [ 3 ] ) ;
    final int x3 = Integer . parseInt ( xs [ 4 ] ) ;
    final int y3 = Integer . parseInt ( xs [ 5 ] ) ;
    xs = input . nextLine ( ) . split ( "\\s+" ) ;
    final int x1n = Integer . parseInt ( xs [ 0 ] ) ;
    final int y1n = Integer . parseInt ( xs [ 1 ] ) ;
    final int x2n = Integer . parseInt ( xs [ 2 ] ) ;
    final int y2n = Integer . parseInt ( xs [ 3 ] ) ;
    final int x3n = Integer . parseInt ( xs [ 4 ] ) ;
    final int y3n = Integer . parseInt ( xs [ 5 ] ) ;
    final int a11 = x2 - x1 - x2n + x1n ;
    final int a12 = x3 - x1 - x3n + x1n ;
    final int a21 = y2 - y1 - y2n + y1n ;
    final int a22 = y3 - y1 - y3n + y1n ;
    final int b1 = x1n - x1 ;
    final int b2 = y1n - y1 ;
    final int D = a11 * a22 - a12 * a21 ;
    final int Da = b1 * a22 - a12 * b2 ;
    final int Db = a11 * b2 - a21 * b1 ;
    final int alpha = Da * 1. / D ;
    final int beta = Db * 1. / D ;
    final int cx = x1 + alpha * ( x2 - x1 ) + beta * ( x3 - x1 ) ;
    final int cy = y1 + alpha * ( y2 - y1 ) + beta * ( y3 - y1 ) ;
    return String . valueOf ( cx ) + " " + String . valueOf ( cy ) ;
  }
  final int N = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String res = solve ( input ) ;
    System . out . println ( "Case #" + ( i +