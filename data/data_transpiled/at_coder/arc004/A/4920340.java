static final double sqrt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Point > points = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    points . add ( Collections . singletonList ( new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ) ) ;
  }
  double max = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      double dist = ( points . get ( i ) - points . get ( j ) ) ;
      if ( dist > max ) max = dist ;
    }
  }
  return max ;
}
