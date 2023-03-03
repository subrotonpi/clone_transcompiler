static final double dist ( double [ ] a , double [ ] b ) {
  final String ls [ ] = System . getProperty ( "line.separator" ) . split ( " " ) ;
  final double dist = ( a [ 0 ] - b [ 0 ] ) ;
  final double x = a [ 1 ] - b [ 1 ] ;
  final double y = a [ 2 ] - b [ 2 ] ;
  final double z = a [ 3 ] - b [ 3 ] ;
  return Math . sqrt ( x * x + y * y + z * z ) ;
}
