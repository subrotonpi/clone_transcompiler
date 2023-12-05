static final String solve ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final double p = scanner . nextDouble ( ) ;
  final double res = 1 ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    res *= a - i ;
  }
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    res /= ( i + 1 ) ;
  }
  return res ;
}
