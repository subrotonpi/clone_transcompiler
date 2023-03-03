@ VisibleForTesting static void readQueue ( ) throws IOException {
  final String input = "Enter a line number (in the range [0, 1])" ;
  final int R = Integer . parseInt ( input ) ;
  final int C = Integer . parseInt ( input ) ;
  final int sy = Integer . parseInt ( input ) ;
  final int sx = Integer . parseInt ( input ) ;
  final int gy = Integer . parseInt ( input ) ;
  final int gx = Integer . parseInt ( input ) ;
  final char [ ] [ ] c = new char [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    c [ i ] = new char [ C ] ;
  }
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    c [ i ] [ 0 ] = '.' ;
  }
  dist [ sy - 1 ] [ sx - 1 ] = 0 ;
  final Queue < Point > queue = new LinkedList < > ( ) ;
  queue . add ( new Point ( sy - 1 , sx - 1 ) ) ;
  queue . add ( new Point ( sy , sx ) ) ;
}
